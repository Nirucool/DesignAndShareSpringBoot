package com.djamware.react.models;

import java.util.List;

public class LivingRoom {
    List<String> livingRoomLikes;

    public LivingRoom(List<String> livingRoomLikes, String livingRoomCount, String livingRoomImage) {
        this.livingRoomImage = livingRoomImage;
        this.livingRoomCount = livingRoomCount;
        this.livingRoomLikes = livingRoomLikes;
    }

    public LivingRoom() {
    }

    public List<String> getLivingRoomLikes() {

        return livingRoomLikes;
    }

    public void setLivingRoomLikes(List<String> livingRoomLikes) {
        this.livingRoomLikes = livingRoomLikes;
    }

    public String getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(String livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }

    public String getLivingRoomImage() {
        return livingRoomImage;
    }

    public void setLivingRoomImage(String livingRoomImage) {
        this.livingRoomImage = livingRoomImage;
    }

    String livingRoomCount;
    String livingRoomImage;
}
