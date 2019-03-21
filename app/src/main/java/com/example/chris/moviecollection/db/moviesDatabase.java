package com.example.chris.moviecollection.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.chris.moviecollection.models.Director;
import com.example.chris.moviecollection.models.Movie;

@Database(entities = {Movie.class, Director.class}, version = 1)
public abstract class moviesDatabase extends RoomDatabase{

    private static final String DATABASE_NAME = "Movies";
    private static moviesDatabase instance = null;

    public static moviesDatabase getInstance(Context context)
    {
        if(instance == null)
        {
            synchronized (moviesDatabase.class)
            {
                instance = Room.databaseBuilder(context.getApplicationContext(),
                                                moviesDatabase.class,
                                                DATABASE_NAME)
                        .build();
            }
        }
        return instance;
    }

    public abstract MovieDao movieDao();

    public abstract DirectorDao directorDao();


}
