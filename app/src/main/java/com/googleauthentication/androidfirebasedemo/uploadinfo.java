package com.googleauthentication.androidfirebasedemo;

public class uploadinfo {

    public String imageName;
    public String imageURL;
    public uploadinfo(){}

    public uploadinfo(String imageName, String imageURL) {
        this.imageName = imageName;
        this.imageURL = imageURL;
    }

    public String getImageName() {
        return imageName;
    }
    public String getImageURL() {
        return imageURL;
    }
}

