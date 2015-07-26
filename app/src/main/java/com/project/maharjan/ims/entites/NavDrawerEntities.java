package com.project.maharjan.ims.entites;

/**
 * Created by Maharjan on 7/24/2015.
 */
public class NavDrawerEntities {
    private int id;
    private String name;

    public NavDrawerEntities() {
    }

    public NavDrawerEntities(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
