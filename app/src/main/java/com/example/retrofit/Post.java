package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userId;
    private Integer id;
    private String title;

    /**
     * text String is supposed to be the body value of the json.
     */
    @SerializedName("body")
    private String text;

    public Post(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    /**
     * Get User ID
     *
     * @return userId which is coming from JSON
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Get ID
     *
     * @return post id which is coming from JSON
     */
    public Integer getId() {
        return id;
    }

    /**
     * Get Title
     *
     * @return title which is coming from JSON
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get Text / Get Body
     *
     * @return body which is coming from JSON
     */
    public String getText() {
        return text;
    }
}
