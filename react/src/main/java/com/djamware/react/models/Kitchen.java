package com.djamware.react.models;

import java.util.List;

public class Kitchen {
    public List<String> getKitchenLikes() {
        return kitchenLikes;
    }

    public void setKitchenLikes(List<String> kitchenLikes) {
        this.kitchenLikes = kitchenLikes;
    }

    public String getKitchenImage() {
        return kitchenImage;
    }

    public void setKitchenImage(String kitchenImage) {
        this.kitchenImage = kitchenImage;
    }

    public String getKitchenCount() {
        return kitchenCount;
    }

    public Kitchen() {
    }

    public Kitchen(List<String> kitchenLikes, String kitchenImage, String kitchenCount) {
        this.kitchenImage = kitchenImage;
        this.kitchenCount = kitchenCount;
        this.kitchenLikes = kitchenLikes;
    }

    public void setKitchenCount(String kitchenCount) {
        this.kitchenCount = kitchenCount;
    }

    List<String> kitchenLikes;
    String kitchenImage;
    String kitchenCount;
}
