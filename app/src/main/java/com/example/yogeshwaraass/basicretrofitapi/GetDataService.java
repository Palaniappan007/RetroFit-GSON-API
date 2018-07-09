package com.example.yogeshwaraass.basicretrofitapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Yogeshwaraa.ss on 7/9/2018.
 */

    public interface GetDataService{
        @GET("/photos")
        Call<List<RetroPhoto>> getAllPhotos();
    }
