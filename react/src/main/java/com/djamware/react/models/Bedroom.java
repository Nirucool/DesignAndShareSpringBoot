package com.djamware.react.models;


import java.util.List;

public class Bedroom {
    List<String> bedroomLikes;
    String bedroomImage;

    public List<String> getBedroomLikes() {
        return bedroomLikes;
    }

    public void setBedroomLikes(List<String> bedroomLikes) {
        this.bedroomLikes = bedroomLikes;
    }

    public Bedroom(List<String> bedroomLikes, String bedroomImage, String bedroomCount) {
        this.bedroomImage = bedroomImage;
        this.bedroomCount = bedroomCount;
        this.bedroomLikes = bedroomLikes;
    }

    public Bedroom() {
    }

    public String getBedroomImage() {
        return bedroomImage;
    }

    public void setBedroomImage(String bedroomImage) {
        this.bedroomImage = bedroomImage;
    }

    public String getBedroomCount() {
        return bedroomCount;
    }

    public void setBedroomCount(String bedroomCount) {
        this.bedroomCount = bedroomCount;
    }

    String bedroomCount;


}

