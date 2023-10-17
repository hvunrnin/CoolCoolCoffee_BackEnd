package com.example.CoolCoolCoffee.domain;

import com.google.cloud.firestore.annotation.DocumentId;

import java.util.List;

public class Cafe_brand {
    @DocumentId
    String cafe_id;
    String cafe_name;
    String logo_img;
    List<Cafe_brand_Menu> menu;

    public String getCafe_id() {
        return cafe_id;
    }

    public void setCafe_id(String cafe_id) {
        this.cafe_id = cafe_id;
    }

    public String getCafe_name() {
        return cafe_name;
    }

    public void setCafe_name(String cafe_name) {
        this.cafe_name = cafe_name;
    }

    public String getLogo_img() {
        return logo_img;
    }

    public void setLogo_img(String logo_img) {
        this.logo_img = logo_img;
    }

    public List<Cafe_brand_Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Cafe_brand_Menu> menu) {
        this.menu = menu;
    }
}
