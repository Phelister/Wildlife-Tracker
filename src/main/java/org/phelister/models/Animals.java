package org.phelister.models;

public class Animals {
    private int id;
    private String type;
    private String name;
    private String health;
    private int age;

    private boolean deleted=false;

    public Animals(String type, String name, String health, int age) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public int  getAge() {
        return age;
    }

    public void setAge(int  age) {
        this.age = age;
    }

}
