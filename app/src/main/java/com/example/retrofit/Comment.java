package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Comment {

    private int postId;
    private int id;
    private String name;
    private String email;

    /**
     * text String is supposed to be the body value of the json.
     */
    @SerializedName("body")
    private String text;

    /**
     * Get Post Id
     *
     * @return post Id which is coming from comment.
     */
    public int getPostId() {
        return postId;
    }

    /**
     * Get Id
     *
     * @return id which is coming from comment
     */
    public int getId() {
        return id;
    }

    /**
     * Get Name
     *
     * @return name which is coming from comment.
     */
    public String getName() {
        return name;
    }

    /**
     * Get Email
     *
     * @return email which is coming from comment
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get Text
     *
     * @return text which is coming from comment.
     */
    public String getText() {
        return text;
    }
}
