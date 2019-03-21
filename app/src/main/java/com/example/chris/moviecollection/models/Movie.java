package com.example.chris.moviecollection.models;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import org.w3c.dom.Text;

@Entity
public class Movie {
    @PrimaryKey(autoGenerate = true)
    private long id;

    private String title;

    private String year;

    @Ignore
    private Integer director_id;

    private String run_time;

    private String collection;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getDirector_id() {
        return director_id;
    }

    public void setDirector_id(Integer director_id) {
        this.director_id = director_id;
    }

    public String getRun_time() {
        return run_time;
    }

    public void setRun_time(String run_time) {
        this.run_time = run_time;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }
}
