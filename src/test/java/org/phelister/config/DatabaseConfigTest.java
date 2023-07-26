package org.phelister.config;

import org.sql2o.Sql2o;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConfigTest {

    public static Sql2o getDatabaseTest(){
        //database url and password
        return new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "postgres", "root");

    }

}