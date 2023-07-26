package org.phelister;
import org.phelister.utils.SharedUtils;

import java.util.HashMap;

import static spark.Spark.post;
import static spark.Spark.get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main {
    public static void main(String[] args) {
        get("/", (req, res)->{
            return SharedUtils.render(new HashMap<>(), "index.hbs");
        });
        get("/wildlife/add", (req, res)->{
            return SharedUtils.render(new HashMap<>(), "wildlife-details.hbs");
        });

        post("/create-wildlife", (req, res)->{
            String category = req.queryParams("category");
            String id = req.queryParams("id");
            String name = req.queryParams("name");
            String health= req.queryParams("health");
            String age=req.queryParams("age");
            String location =req.queryParams("location");
            String rangerName =req.queryParams("rangername");

            try{
                if(category==null || category.length()==0 || id ==null  || id.length()==0|| name==null|| name.length()==0||health==null ||health.length()==0 || age ==null || age.length()==0
                || location==null || location.length()==0 || rangerName==null || rangerName.length()==0 ){
                    throw new IllegalArgumentException("invalid input all fields have to be provided");
                }
                int latestId= Integer.valueOf(id);
                int latestAge= Integer.valueOf(age);



            }catch (Exception e){

                System.out.print(e.getMessage());
            }

//            Strength strength = new Strength();
//            strength.setScore(score);
//            strength.setName(name);
//
//            StrengthDao.create(strength);

            res.redirect("/");
            return null;
        });
    }
}