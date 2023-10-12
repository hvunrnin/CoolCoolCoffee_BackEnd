package com.example.CoolCoolCoffee.service;

import com.example.CoolCoolCoffee.domain.Members;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;

@Service
public class FirebaseServiceImpl implements FirebaseService{
    public static final String COLLECTION_NAME = "Members";
    @Override
    public String insertMember(Members members) throws Exception{
        Firestore firestore = FirestoreClient.getFirestore();
        ApiFuture<com.google.cloud.firestore.WriteResult> apiFuture =
                firestore.collection(COLLECTION_NAME).document(members.getUser_name()).set(members);
        return apiFuture.get().getUpdateTime().toString();
    }
    @Override
    public Members getMemberDetail(String id) throws Exception{
        Firestore firestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = firestore.collection(COLLECTION_NAME).document(id);
        ApiFuture<DocumentSnapshot> apiFuture = documentReference.get();
        DocumentSnapshot documentSnapshot = apiFuture.get();
        Members members = null;
        if (documentSnapshot.exists()){
            members = documentSnapshot.toObject(Members.class);
            return members;
        }
        else{
            return null;
        }
    }
    @Override
    public String updateMember(Members members) throws Exception{
        Firestore firestore = FirestoreClient.getFirestore();
        ApiFuture<com.google.cloud.firestore.WriteResult> apiFuture
                = firestore.collection(COLLECTION_NAME).document(members.getUser_name()).set(members);
        return apiFuture.get().getUpdateTime().toString();
    }
    @Override
    public String deleteMember(String name) throws Exception{
        Firestore firestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> apiFuture
                = firestore.collection(COLLECTION_NAME).document(name).delete();
        return "Document name: " + name + " delete";
    }
}
