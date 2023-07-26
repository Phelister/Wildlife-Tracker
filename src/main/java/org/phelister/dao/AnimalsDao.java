package org.phelister.dao;

import org.phelister.models.Sightings;
import org.sql2o.Connection;

public class AnimalsDao {

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
