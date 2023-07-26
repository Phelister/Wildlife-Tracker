package org.phelister.dao;

import org.phelister.config.DatabaseConfig;
import org.phelister.models.Animals;
import org.phelister.models.Sightings;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class SightingsDao {

        private static final Sql2o sql2o = DatabaseConfig.getDatabaseProduction();

//        public static boolean  createSighting(Sightings sightings, Animals animals,) {
//            try (Connection connection = sql2o.open()) {
//                String queryHeroes = "SELECT * FROM heroes WHERE NOT deleted AND squad_id = :squadId;";
//               connection.createQuery(queryHeroes)
////                        .addParameter("squadId", squadId)
//                        .executeAndFetch(Animals.class);
//               return true;
//            } catch (Exception exception) {
//                System.out.println(exception.getMessage());
//                return false;
//            }
//        }


}
