package org.phelister.config;
import org.sql2o.Sql2o;

public class DatabaseConfig {
    public static Sql2o getDatabaseTest(){
        //database url and password
            return new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "postgres", "root");

    }
    public static Sql2o getDatabaseProduction(){
        //database url and password
        return new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "postgres", "root");

    }


}
