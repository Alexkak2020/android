package com.googleauthentication.androidfirebasedemo;

public class Images {

    private String imageName;
    private String imageURL;
    private String imageView;

    public Images() {
    }


    public Images(String imageName, String imageURL, String imageView) {
        this.imageName = imageName;
        this.imageURL = imageURL;
        this.imageView = imageView;
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

    //image view added
    public String getImageView() {
        return imageView;
    }

    public void setImageView(String imageView) {
        this.imageView = imageView;
    }
}
