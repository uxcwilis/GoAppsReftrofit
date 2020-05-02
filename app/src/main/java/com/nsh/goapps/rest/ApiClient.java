package com.nsh.goapps.rest;

import com.nsh.goapps.config.ServerConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = ServerConfig.API_ENDPOINT;

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }
}
