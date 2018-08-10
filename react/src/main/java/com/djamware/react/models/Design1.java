package com.djamware.react.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "design")
public class Design1 {
    public Design1(String userName, String password, String firstName, String lastName, List<String> patioImages, List<String> bedroomImages, List<String> livingRoomImages, List<String> kitchenImages, List<String> kitchenGardenImages, List<String> diyImages, List<String> kidsRoomImages, List<Integer> patioCount, List<Integer> bedroomCount, List<Integer> livingRoomCount, List<Integer> kitchenCount, List<Integer> kitchenGardenCount, List<Integer> diyCount, List<Integer> kidsRoomCount, List<List<String>> patioLikes) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patioImages = patioImages;
        this.bedroomImages = bedroomImages;
        this.livingRoomImages = livingRoomImages;
        this.kitchenImages = kitchenImages;
        this.kitchenGardenImages = kitchenGardenImages;
        this.diyImages = diyImages;
        this.kidsRoomImages = kidsRoomImages;
        this.patioCount = patioCount;
        this.bedroomCount = bedroomCount;
        this.livingRoomCount = livingRoomCount;
        this.kitchenCount = kitchenCount;
        this.kitchenGardenCount = kitchenGardenCount;
        this.diyCount = diyCount;
        this.kidsRoomCount = kidsRoomCount;
        this.patioLikes = patioLikes;
    }


    @Id
    String userName;
    String password;
    String firstName;
    String lastName;
    List<String> patioImages;
    List<String> bedroomImages;
    List<String> livingRoomImages;
    List<String> kitchenImages;
    List<String> kitchenGardenImages;
    List<String> diyImages;
    List<String> kidsRoomImages;
    List<Integer> patioCount;
    List<Integer> bedroomCount;

    public List<List<String>> getPatioLikes() {
        return patioLikes;
    }

    public void setPatioLikes(List<List<String>> patioLikes) {
        this.patioLikes = patioLikes;
    }

    List<Integer> livingRoomCount;
    List<Integer> kitchenCount;
    List<Integer> kitchenGardenCount;
    List<Integer> diyCount;
    List<Integer> kidsRoomCount;
    List<List<String>> patioLikes;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPatioImages() {
        return patioImages;
    }

    public void setPatioImages(List<String> patioImages) {
        this.patioImages = patioImages;
    }

    public List<String> getBedroomImages() {
        return bedroomImages;
    }

    public void setBedroomImages(List<String> bedroomImages) {
        this.bedroomImages = bedroomImages;
    }

    public List<String> getLivingRoomImages() {
        return livingRoomImages;
    }

    public void setLivingRoomImages(List<String> livingRoomImages) {
        this.livingRoomImages = livingRoomImages;
    }

    public List<String> getKitchenImages() {
        return kitchenImages;
    }

    public void setKitchenImages(List<String> kitchenImages) {
        this.kitchenImages = kitchenImages;
    }

    public List<String> getKitchenGardenImages() {
        return kitchenGardenImages;
    }

    public void setKitchenGardenImages(List<String> kitchenGardenImages) {
        this.kitchenGardenImages = kitchenGardenImages;
    }

    public List<String> getDiyImages() {
        return diyImages;
    }

    public void setDiyImages(List<String> diyImages) {
        this.diyImages = diyImages;
    }

    public List<String> getKidsRoomImages() {
        return kidsRoomImages;
    }

    public void setKidsRoomImages(List<String> kidsRoomImages) {
        this.kidsRoomImages = kidsRoomImages;
    }

    public List<Integer> getPatioCount() {
        return patioCount;
    }

    public void setPatioCount(List<Integer> patioCount) {
        this.patioCount = patioCount;
    }

    public List<Integer> getBedroomCount() {
        return bedroomCount;
    }

    public void setBedroomCount(List<Integer> bedroomCount) {
        this.bedroomCount = bedroomCount;
    }

    public List<Integer> getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(List<Integer> livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }

    public List<Integer> getKitchenCount() {
        return kitchenCount;
    }

    public void setKitchenCount(List<Integer> kitchenCount) {
        this.kitchenCount = kitchenCount;
    }

    public List<Integer> getKitchenGardenCount() {
        return kitchenGardenCount;
    }

    public void setKitchenGardenCount(List<Integer> kitchenGardenCount) {
        this.kitchenGardenCount = kitchenGardenCount;
    }

    public List<Integer> getDiyCount() {
        return diyCount;
    }

    public void setDiyCount(List<Integer> diyCount) {
        this.diyCount = diyCount;
    }

    public List<Integer> getKidsRoomCount() {
        return kidsRoomCount;
    }

    public Design1() {
    }

    public void setKidsRoomCount(List<Integer> kidsRoomCount) {
        this.kidsRoomCount = kidsRoomCount;
    }
}
