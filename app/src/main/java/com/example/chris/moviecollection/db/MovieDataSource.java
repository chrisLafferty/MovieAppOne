package com.example.chris.moviecollection.db;

import android.content.Context;

import com.example.chris.moviecollection.models.Movie;

public class MovieDataSource
{
    private static final String TAG = MovieDataSource.class.getSimpleName();
    private final MovieDao movieDao;
    private final DirectorDao directorDao;


    public MovieDataSource (Context context)
    {
        moviesDatabase database = moviesDatabase.getInstance(context);
        movieDao = database.movieDao();
        directorDao = database.directorDao();

    }

    public void createMovie (Movie movie)
    {
        long rowId = movieDao.createMovie(movie);

    }

}
