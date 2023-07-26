package org.phelister.dao;

import org.phelister.config.DatabaseConfig;
import org.phelister.models.Animals;
import org.phelister.models.Sightings;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class SightingsDao {

        private static final Sql2o sql2o = DatabaseConfig.getDatabaseProduction();

        public static boolean  createSighting(Sightings sightings) {
            try (Connection connection = sql2o.open()) {
                    String query = "INSERT INTO sightings ( name,age, squad_id, weakness_id, strength_id) VALUES (:name,:age, :squad_id, :weakness_id, :strength_id);";
                    connection.createQuery(query)
                            .addParameter("age", hero.getAge())
                            .addParameter("name", hero.getName())
                            .addParameter("squad_id", hero.getSquadIid())
                            .addParameter("weakness_id", hero.getWeaknessId())
                            .addParameter("strength_id", hero.getStrengthId())
                            .executeUpdate();
                    return true;
               connection.createQuery(queryHeroes)
//                        .addParameter("squadId", squadId)
                        .executeAndFetch(Animals.class);
               return true;
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                return false;
            }
        }


}
