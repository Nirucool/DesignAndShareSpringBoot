package com.djamware.react.models;

import java.util.List;

public class KitchenGarden {
    public List<String> getKitchenGardenLikes() {
        return kitchenGardenLikes;
    }

    public void setKitchenGardenLikes(List<String> kitchenGardenLikes) {
        this.kitchenGardenLikes = kitchenGardenLikes;
    }

    public String getKitchenGardenCount() {
        return kitchenGardenCount;
    }

    public void setKitchenGardenCount(String kitchenGardenCount) {
        this.kitchenGardenCount = kitchenGardenCount;
    }

    public String getKitchenGardenImage() {
        return kitchenGardenImage;
    }

    public void setKitchenGardenImage(String kitchenGardenImage) {
        this.kitchenGardenImage = kitchenGardenImage;
    }

    List<String> kitchenGardenLikes;

    public KitchenGarden() {
    }

    public KitchenGarden(List<String> kitchenGardenLikes, String kitchenGardenCount, String kitchenGardenImage) {
        this.kitchenGardenImage = kitchenGardenImage;
        this.kitchenGardenCount = kitchenGardenCount;
        this.kitchenGardenLikes = kitchenGardenLikes;


    }

    String kitchenGardenCount;
    String kitchenGardenImage;
}
