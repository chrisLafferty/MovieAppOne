package com.example.chris.moviecollection.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "director_info",
        foreignKeys = @ForeignKey(entity = Movie.class,
        parentColumns = "id",
        childColumns = "director_id"))
public class Director {

    @PrimaryKey
    private long director_id;

    private String first_name;

    private String last_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
