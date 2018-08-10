package com.djamware.react.models;

import java.util.List;

public class DIY {
    List<String> diyLikes;
    String diyCount;
    String diyImage;

    public List<String> getDiyLikes() {
        return diyLikes;
    }

    public DIY() {
    }

    public DIY(List<String> diyLikes, String diyCount, String diyImage) {
        this.diyCount = diyCount;
        this.diyImage = diyImage;
        this.diyLikes = diyLikes;

    }

    public void setDiyLikes(List<String> diyLikes) {

        this.diyLikes = diyLikes;
    }

    public String getDiyCount() {
        return diyCount;
    }

    public void setDiyCount(String diyCount) {
        this.diyCount = diyCount;
    }

    public String getDiyImage() {
        return diyImage;
    }

    public void setDiyImage(String diyImage) {
        this.diyImage = diyImage;
    }
}
