package com.triptip.triptip.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String login;
    private String password;
    private String pictureurl;

    public User(){

    }

    public User(int id, String login, String password, String pictureUrl) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.pictureurl = pictureUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPictureUrl() {
        return pictureurl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureurl = pictureUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", pictureUrl='" + pictureurl + '\'' +
                '}';
    }
}
