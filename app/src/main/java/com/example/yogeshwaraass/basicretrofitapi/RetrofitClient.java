package com.example.yogeshwaraass.basicretrofitapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Yogeshwaraa.ss on 7/9/2018.
 */

public class RetrofitClient {
    public static Retrofit retrofit;
    public static final String BASE_URL="https://jsonplaceholder.typicode.com";
    public static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            retrofit=new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
