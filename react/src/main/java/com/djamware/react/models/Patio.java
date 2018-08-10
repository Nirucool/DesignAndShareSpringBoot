package com.djamware.react.models;

import java.util.List;

public class Patio {
    List<String> patioLikes;

    public Patio(List<String> patioLikes, String patioImage, String patioCount) {
        this.patioImage = patioImage;
        this.patioCount = patioCount;
        this.patioLikes = patioLikes;
    }

    public Patio() {
    }

    public List<String> getPatioLikes() {

        return patioLikes;
    }

    public void setPatioLikes(List<String> patioLikes) {
        this.patioLikes = patioLikes;
    }

    public String getPatioImage() {
        return patioImage;
    }

    public void setPatioImage(String patioImage) {
        this.patioImage = patioImage;
    }

    public String getPatioCount() {
        return patioCount;
    }

    public void setPatioCount(String patioCount) {
        this.patioCount = patioCount;
    }

    String patioImage;
    String patioCount;


}
