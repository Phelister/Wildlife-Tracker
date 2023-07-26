package org.phelister;
import org.phelister.dao.AnimalsDao;
import org.phelister.dao.SightingsDao;
import org.phelister.models.Animals;
import org.phelister.models.Sightings;
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

        post("/create-sighting", (req, res)->{
            String id = req.queryParams("id");
            String location =req.queryParams("location");
            String rangerName =req.queryParams("rangername");

            try{
                if( id ==null  || id.length()==0
                || location==null || location.length()==0 || rangerName==null || rangerName.length()==0 ){
                    throw new IllegalArgumentException("invalid input all fields have to be provided");
                }
                int latestId= Integer.valueOf(id);
                Animals animal=AnimalsDao.findAnimalById(latestId);
                Sightings sightings= new Sightings(animal.getId(), location, rangerName);

                //save sighting
                SightingsDao.createSighting(sightings);

            }catch (Exception e){

                System.out.print(e.getMessage());
            }

            res.redirect("/");
            return null;
        });

        post("/create-animal", (req, res)->{
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

            res.redirect("/");
            return null;
        });
    }
}