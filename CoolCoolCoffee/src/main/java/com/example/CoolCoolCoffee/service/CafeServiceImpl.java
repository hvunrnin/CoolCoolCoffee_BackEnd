package com.example.CoolCoolCoffee.service;

import com.example.CoolCoolCoffee.domain.Cafe_brand;
import com.example.CoolCoolCoffee.domain.Cafe_brand_Menu;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CafeServiceImpl implements CafeService{
    public static final String COLLECTION_NAME = "Cafe_brand";
    public static final String MENUS_SUBCOLLECTION = "menus";
    @Override
    public Cafe_brand getBrandMenuList(String cafeBrandId) throws Exception {
        Firestore firestore = FirestoreClient.getFirestore();
        DocumentReference documentReference = firestore.collection(COLLECTION_NAME).document(cafeBrandId);
        ApiFuture<DocumentSnapshot> apiFuture = documentReference.get();
        DocumentSnapshot documentSnapshot = apiFuture.get();
        Cafe_brand cafeBrand = null;
        if (documentSnapshot.exists()){
            cafeBrand = documentSnapshot.toObject(Cafe_brand.class);
            return cafeBrand;
        }
        else {
            return null;
        }
    }
    @Override
    public List<Cafe_brand_Menu> getCafeMenus(String cafeId) throws Exception {
        Firestore firestore = FirestoreClient.getFirestore();

        DocumentReference cafeDocumentRef = firestore.collection(COLLECTION_NAME).document(cafeId);
        DocumentSnapshot cafeDocumentSnapshot = cafeDocumentRef.get().get();
        if (cafeDocumentSnapshot.exists()) {
            // Get the subcollection reference
            CollectionReference menusCollectionRef = cafeDocumentRef.collection(MENUS_SUBCOLLECTION);

            // Retrieve all documents from the subcollection
            QuerySnapshot menusQuerySnapshot = menusCollectionRef.get().get();

            List<Cafe_brand_Menu> menus = new ArrayList<>();

            // Convert each document to a Cafe_Brand_Menu object
            for (QueryDocumentSnapshot menuDocument : menusQuerySnapshot) {
                Cafe_brand_Menu menu = menuDocument.toObject(Cafe_brand_Menu.class);
                menus.add(menu);
            }

            return menus;
        } else {
            return null;
        }
    }
    @Override
    public Cafe_brand_Menu getBrandMenuDetail(String cafeBrandName, String cafeMenuId) throws Exception {
        return null;
    }
}
