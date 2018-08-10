package com.djamware.react.models;

import java.util.List;

public class KidsRoom {
    public List<String> getKidsRoomLikes() {
        return kidsRoomLikes;
    }

    public void setKidsRoomLikes(List<String> kidsRoomLikes) {
        this.kidsRoomLikes = kidsRoomLikes;
    }

    public KidsRoom(List<String> kidsRoomLikes, String kidsRoomCount, String kidsRoomImage) {
        this.kidsRoomImage = kidsRoomImage;
        this.kidsRoomCount = kidsRoomCount;
        this.kidsRoomLikes = kidsRoomLikes;
    }

    public String getKidsRoomCount() {
        return kidsRoomCount;
    }

    public KidsRoom() {
    }

    public void setKidsRoomCount(String kidsRoomCount) {
        this.kidsRoomCount = kidsRoomCount;
    }

    public String getKidsRoomImage() {
        return kidsRoomImage;
    }

    public void setKidsRoomImage(String kidsRoomImage) {
        this.kidsRoomImage = kidsRoomImage;
    }

    List<String> kidsRoomLikes;
    String kidsRoomCount;
    String kidsRoomImage;
}
