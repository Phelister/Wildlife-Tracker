package org.phelister.models;

public class Sightings {
    private int id;
    private int animal_id;
    private Location location;


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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getRangerName() {
        return RangerName;
    }

    public void setRangerName(String rangerName) {
        RangerName = rangerName;
    }

    private String RangerName;
}
