package org.phelister.dao;

import org.phelister.config.DatabaseConfig;
import org.phelister.models.Animals;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class AnimalsDao {

        private static final Sql2o sql2o = DatabaseConfig.getDatabaseTest();

        public static void create(Animals animals){

        }

        public static List<Animals> findAllHeroesBySquadId(int squadId) {
            try (Connection connection = sql2o.open()) {
                String queryHeroes = "SELECT * FROM heroes WHERE NOT deleted AND squad_id = :squadId;";
                return connection.createQuery(queryHeroes)
                        .addParameter("squadId", squadId)
                        .executeAndFetch(Animals.class);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                return  null;
            }
        }

        public static void assignHeroToSquad(int heroId, int squadId){
            try (Connection connection = sql2o.open()) {
                String queryHeroes = "UPDATE heroes SET squad_id = :squadId WHERE id = :heroId;";
                connection.createQuery(queryHeroes)
                        .addParameter("squadId", squadId)
                        .addParameter("heroId", heroId)
                        .executeUpdate();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        }

}
