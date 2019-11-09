package com.example.closeup.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class House {

    @Id
    private long id;

    private int numberOfRooms;

    private int floor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
