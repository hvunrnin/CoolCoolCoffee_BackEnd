package com.example.CoolCoolCoffee.controller;

import com.example.CoolCoolCoffee.domain.Members;
import com.example.CoolCoolCoffee.service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Member;

@org.springframework.web.bind.annotation.RestController
public class Restcontroller {
    @Autowired
    FirebaseService firebaseService;

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
}
