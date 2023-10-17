package com.example.CoolCoolCoffee.service;

import com.example.CoolCoolCoffee.domain.Cafe_brand_Menu;
import com.example.CoolCoolCoffee.domain.Cafe_brand;

import java.util.List;

public interface CafeService {
    public Cafe_brand getBrandMenuList(String cafeBrandId) throws Exception;
    public List<Cafe_brand_Menu> getCafeMenus(String cafeId) throws Exception;
    public Cafe_brand_Menu getBrandMenuDetail(String cafeBrandName, String cafeMenuId) throws Exception;
}
