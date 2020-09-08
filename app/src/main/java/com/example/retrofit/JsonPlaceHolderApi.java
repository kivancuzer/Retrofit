package com.example.retrofit;


import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {
    /**
     * https://jsonplaceholder.typicode.com/posts => @GET("posts")
     *
     * @return all Posts
     *
     * @GET("posts") Call<List < Post>> getPosts();
     */

    /**
     * Get posts with specific user Id
     *
     * @param userId which user's posts will be get.
     * @return posts which are user id is equal to parameter.
     *
     * @GET("posts")
     *     Call<List < Post>> getPosts(@Query("userId") int userId);
     */

    //Integer can be nullable
    //But int can't be nullable.

    /**
     * Get Posts with Query
     * Get Posts with Sorting and Ordering
     *
     * @param userId userId[] which user's posts will be get.
     * @param sort  sort by parameter.
     * @param order order by parameter.
     *
     * @return sorted and ordered posts.
     */
    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("userId") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    /**
     * Get Posts with QueryMap
     *
     * @param parameters which parameters want to use
     * @return posts matching with parameters.
     */
    @GET("posts")
    Call<List<Post>> getPosts(@QueryMap Map<String, String> parameters);

    /**
     * Get Posts with Path
     *
     * @param postId
     * @return
     */
    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);

    /**
     * Get Comments with Url
     *
     * @param url which url will be use for getting comments.
     * @return comments which found in url.
     */
    @GET
    Call<List<Comment>> getComments(@Url String url);

}
