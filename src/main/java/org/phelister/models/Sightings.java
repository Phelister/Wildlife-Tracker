package org.phelister.models;

public class Sightings {
    private int id;
    private int animal_id;
    private String location;
    private String Ranger_name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnimal_id() {
        return animal_id;
    }

    public void setAnimal_id(int animal_id) {
        this.animal_id = animal_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRangerName() {
        return Ranger_name;
    }

    public void setRangerName(String rangerName) {
        Ranger_name = rangerName;
    }


}
