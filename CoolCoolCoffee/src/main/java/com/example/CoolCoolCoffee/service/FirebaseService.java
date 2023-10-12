package com.example.CoolCoolCoffee.service;

import com.example.CoolCoolCoffee.domain.Members;

public interface FirebaseService {
    public String insertMember(Members members) throws Exception;
    public Members getMemberDetail(String id) throws Exception;
    public String updateMember(Members members) throws Exception;
    public String deleteMember(String id) throws Exception;
}
