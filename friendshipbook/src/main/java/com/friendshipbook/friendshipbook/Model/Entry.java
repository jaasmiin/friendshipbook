package com.friendshipbook.friendshipbook.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Entry {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String birthday;
    private String height;
    private String eyeColour;
    private String address;
    private String wish;
    private String dislike;
    private String like;

    // Standard- Constructor
    public Entry() {}



    // Constructor
    public Entry(String name, String birthday, String height, String eyeColour, String address, String wish, String dislike, String like) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.eyeColour = eyeColour;
        this.address = address;
        this.wish = wish;
        this.dislike = dislike;
        this.like = like;
    }

    //getter
    public Long getID() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getHeight() {
        return height;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public String getAddress() {
        return address;
    }

    public String getWish() {
        return wish;
    }

    public String getDislike() {
        return dislike;
    }

    public String getLike() {
        return like;
    }

//setter
public void setId(Long id) {
    this.id = id;
}

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }
    public void setDislike(String dislike) {
        this.dislike = dislike;
    }

    public void setLike(String like) {
        this.like = like;
    }



}
