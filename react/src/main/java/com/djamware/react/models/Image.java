package com.djamware.react.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "image")
public class Image {
    @Id
    private String id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String image;
    private String type;

    public Image(String id,String image,String type) {
        this.id = id;
        this.image=image;
        this.type=type;
    }

    public Image() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }
}
