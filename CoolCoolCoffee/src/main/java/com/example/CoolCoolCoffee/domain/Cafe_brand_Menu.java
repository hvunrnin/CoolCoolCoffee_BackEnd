package com.example.CoolCoolCoffee.domain;

import com.google.cloud.firestore.annotation.DocumentId;

public class Cafe_brand_Menu {
    @DocumentId
    String menu_id;
    String menu_name;
    Long caffeine_content;
    String menu_img;
    String size;

    public String getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(String menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public Long getCaffeine_content() {
        return caffeine_content;
    }

    public void setCaffeine_content(Long caffeine_content) {
        this.caffeine_content = caffeine_content;
    }

    public String getMenu_img() {
        return menu_img;
    }

    public void setMenu_img(String menu_img) {
        this.menu_img = menu_img;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
