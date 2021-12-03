package com.example.instagramclone;

public class PostModel {

   private int postPhotos;
   private String userName;

    public int getPostPhotos() {
        return this.postPhotos;
    }

    public void setPostPhotos(int postPhotos) {
        this.postPhotos = postPhotos;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PostModel(int postPhotos, String userName) {
        this.postPhotos = postPhotos;
        this.userName = userName;


    }
}