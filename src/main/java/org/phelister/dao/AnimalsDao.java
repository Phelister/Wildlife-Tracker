package org.phelister.dao;

import org.phelister.config.DatabaseConfig;
import org.phelister.models.Animals;
import org.phelister.models.Sightings;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class AnimalsDao {

        private static final Sql2o sql2o = DatabaseConfig.getDatabaseTest();

        public static void create(Sightings sightings){

        }

        public static boolean  createSighting(int squadId) {
            try (Connection connection = sql2o.open()) {
                String queryHeroes = "SELECT * FROM heroes WHERE NOT deleted AND squad_id = :squadId;";
               connection.createQuery(queryHeroes)
                        .addParameter("squadId", squadId)
                        .executeAndFetch(Animals.class);
               return true;
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                return false;
            }
        }


}
