package com.example.chris.moviecollection.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;

import com.example.chris.moviecollection.models.Director;

@Dao
public interface DirectorDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long createDirector(Director director);

}
