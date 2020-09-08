package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    /**
     * https://jsonplaceholder.typicode.com/posts => @GET("posts")
     *
     * @return
     */
    @GET("posts")
    Call<List<Post>> getPosts();
}
