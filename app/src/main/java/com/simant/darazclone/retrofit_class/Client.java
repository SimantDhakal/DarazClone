package com.simant.darazclone.retrofit_class;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    public static Retrofit retrofit = null;

    public static Retrofit getRetrofit(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    // change base url from hosting cpanel to local url
//                    .baseUrl("http://www.piyushp.com.np/sport_fanatic/api/member/")
                    // local url
                    .baseUrl("http://192.168.137.1:3000/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}