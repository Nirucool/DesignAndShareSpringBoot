package com.djamware.react.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "design")
public class Design {

    public String getUserName() {
        return userName;
    }

    public Design() {
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPatio(List<Patio> patio) {
        this.patio = patio;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Bedroom> getBedroom() {
        return bedroom;
    }

    public void setBedroom(List<Bedroom> bedroom) {
        this.bedroom = bedroom;
    }

    public List<Patio> getPatio() {
        return patio;
    }

    @Id
    String userName;
    String password;
    String firstName;

    public Design(String userName, String password, String firstName, String lastName, List<Patio> patio,
                  List<Bedroom> bedroom, List<Kitchen> kitchen, List<KitchenGarden> kitchenGarden,
                  List<DIY> diy, List<KidsRoom> kidsRoom, List<LivingRoom> livingRoom) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patio = patio;
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.kitchenGarden = kitchenGarden;
        this.diy = diy;
        this.kidsRoom = kidsRoom;
        this.livingRoom = livingRoom;
    }

    String lastName;
    List<Patio> patio;
    List<Bedroom> bedroom;

    public List<Kitchen> getKitchen() {
        return kitchen;
    }

    public void setKitchen(List<Kitchen> kitchen) {
        this.kitchen = kitchen;
    }

    public List<KitchenGarden> getKitchenGarden() {
        return kitchenGarden;
    }

    public void setKitchenGarden(List<KitchenGarden> kitchenGarden) {
        this.kitchenGarden = kitchenGarden;
    }

    public List<DIY> getDiy() {
        return diy;
    }

    public void setDiy(List<DIY> diy) {
        this.diy = diy;
    }

    public List<KidsRoom> getKidsRoom() {
        return kidsRoom;
    }

    public void setKidsRoom(List<KidsRoom> kidsRoom) {
        this.kidsRoom = kidsRoom;
    }

    public List<LivingRoom> getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(List<LivingRoom> livingRoom) {
        this.livingRoom = livingRoom;
    }

    List<Kitchen> kitchen;
    List<KitchenGarden> kitchenGarden;
    List<DIY> diy;
    List<KidsRoom> kidsRoom;
    List<LivingRoom> livingRoom;


}
