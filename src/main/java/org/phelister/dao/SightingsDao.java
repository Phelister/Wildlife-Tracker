package org.phelister.dao;

import org.phelister.config.DatabaseConfig;
import org.phelister.models.Animals;
import org.phelister.models.Sightings;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class SightingsDao {

        private static final Sql2o sql2o = DatabaseConfig.getDatabaseProduction();

        private int id;
        private int animal_id;
        private String location;
        private String ranger_name;

        public static boolean  createSighting(Sightings sightings) {
            try (Connection connection = sql2o.open()) {
                    String query = "INSERT INTO sightings ( animal_id ,location, ranger_name) VALUES (:animalId,:location, :rangerName);";
                    connection.createQuery(query)
                            .addParameter("animalId", sightings.getAnimal_id())
                            .addParameter("location", sightings.getLocation())
                            .addParameter("rangerName",sightings.getRangerName())
                            .executeUpdate();
                    return true;
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                return false;
            }
        }


}
