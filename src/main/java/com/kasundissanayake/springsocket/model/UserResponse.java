package com.kasundissanayake.springsocket.model;

public class UserResponse {

    private String content;

    public UserResponse(String content) {
        this.content = content;
    }

    public UserResponse() {
    }

    public String getContent() {
        return content;
    }
}
