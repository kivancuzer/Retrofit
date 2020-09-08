package com.example.retrofit;


import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
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
     * @param sort   sort by parameter.
     * @param order  order by parameter.
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
     * @param parameters is which parameters will be use to get data.
     * @return posts matching with parameters.
     */
    @GET("posts")
    Call<List<Post>> getPosts(@QueryMap Map<String, String> parameters);

    /**
     * Get Comments with Path
     *
     * @param postId is which post's comments will be get.
     * @return comments in the path.
     */
    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);

    /**
     * Get Comments with Url
     *
     * @param url is which will be use for getting comments.
     * @return comments which found in url.
     */
    @GET
    Call<List<Comment>> getComments(@Url String url);

    /**
     * Create Post
     *
     * @param post which post will be created.
     * @return post
     */
    @POST("posts")
    Call<Post> createPost(@Body Post post);

    /**
     * Create Post with FormUrlEncoded and Field
     *
     * @param userId which user will be post this.
     * @param title  which title will be used in post's title.
     * @param text   which text will be used in post's body.
     * @return post
     */
    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(
            @Field("userId") int userId,
            @Field("title") String title,
            @Field("body") String text
    );

    /**
     * Create Post with FieldMap
     *
     * @param fields is which information is required to create post.
     * @return post
     */
    @FormUrlEncoded
    @POST("posts")
    Call<Post> createPost(@FieldMap Map<String, String> fields);

    /**
     * Put post
     * change old post with the new one
     * if some parameters are null it will be change post with null values.)
     *
     * @param id   which post will be updated.
     * @param post is new post which will be replaced with old one.
     * @return post which is updated
     */
    @PUT("posts/{id}")
    Call<Post> putPost(@Path("id") int id, @Body Post post);

    /**
     * Patch Post
     * change new values with the old values
     * if some parameters are null it won't change
     *
     * @param id   which post will be updated.
     * @param post is new post which will be replaced with old one.
     * @return post which is updated.
     */
    @PATCH("posts/{id}")
    Call<Post> patchPost(@Path("id") int id, @Body Post post);

    /**
     * Delete Post
     *
     * @param id which post will be deleted.
     * @return response code
     */
    @DELETE("posts/{id}")
    Call<Void> deletePost(@Path("id") int id);

}
