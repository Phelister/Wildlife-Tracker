package org.phelister;
import org.phelister.utils.SharedUtils;

import java.util.HashMap;

import static spark.Spark.post;
import static spark.Spark.get;
public class Main {
    public static void main(String[] args) {
        get("/", (req, res)->{
            return SharedUtils.render(new HashMap<>(), "index.hbs");
        });
        get("/wildlife/add", (req, res)->{
            return SharedUtils.render(new HashMap<>(), "wildlife-details.hbs");
        });
    }
}