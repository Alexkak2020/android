package com.googleauthentication.androidfirebasedemo;

import com.google.firebase.database.Exclude;

public class Upload {
    private String imageName;
    private String imageURL;
    private String mKey;

    public Upload() {
        //empty constructor needed
    }
    public Upload(String imageName, String imageURL) {
        if (imageName.trim().equals("")) {
            imageName = "No Name";
        }

        this.imageName = imageName;
        this.imageURL = imageURL;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String key) {
        mKey = key;
    }

//    public String getName() {
//        return imageName;
//    }
//
//    public void setName(String imageName) {
//        imageName = imageName;
//    }
//
//    public String getImageUrl() {
//        return imageURL;
//    }
//
//    public void setImageUrl(String imageURL) {
//        imageURL = imageURL;
//    }
}
