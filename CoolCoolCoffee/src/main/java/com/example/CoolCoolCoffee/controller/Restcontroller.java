package com.example.CoolCoolCoffee.controller;

import com.example.CoolCoolCoffee.domain.Cafe_brand;
import com.example.CoolCoolCoffee.domain.Cafe_brand_Menu;
import com.example.CoolCoolCoffee.domain.Members;
import com.example.CoolCoolCoffee.service.CafeService;
import com.example.CoolCoolCoffee.service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class Restcontroller {
    @Autowired
    FirebaseService firebaseService;
    @Autowired
    CafeService cafeService;

    @GetMapping("/insertMember")
    public String insertMember(@RequestParam Members members) throws Exception{
        return firebaseService.insertMember(members);
    }
    @GetMapping("/getMemberDetail")
    public Members getMemberDetail(@RequestParam String id) throws Exception{
        return firebaseService.getMemberDetail(id);
    }
    @GetMapping("/updateMember")
    public String updateMember(@RequestParam Members members) throws Exception{
        return firebaseService.updateMember(members);
    }
    @GetMapping("/deleteMember")
    public String deleteMember(@RequestParam String name) throws Exception{
        return firebaseService.deleteMember(name);
    }
    @GetMapping("/getMenuDetail")
    public Cafe_brand getCafeBrandList(@RequestParam String id) throws Exception{
        return cafeService.getBrandMenuList(id);
    }
    /*@GetMapping("/{cafebrand_id}/{cafemenu_id}/getMenuDetail")
    public Cafe_Brand_Menu getCafeMenuDetail(
            @PathVariable("cafebrand_id") String cafeBrandId,
            @PathVariable("cafemenu_id") String cafeMenuId) throws ExecutionException, InterruptedException {
        return cafeService.getCafeMenuDetail(cafeBrandId, cafeMenuId);
    }*/
    @GetMapping("/{cafeId}/menus")
    public List<Cafe_brand_Menu> getCafeMenus(@PathVariable String cafeId) throws Exception{
        return cafeService.getCafeMenus(cafeId);
    }
}
