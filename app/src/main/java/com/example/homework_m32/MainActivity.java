package com.example.homework_m32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> contact = new ArrayList<>();
    private RecyclerView itemContacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        CustomAdapter customAdapter = new CustomAdapter(loadData(contact));
        itemContacts.setAdapter(customAdapter);
    }






    private void initView() {
        itemContacts = findViewById(R.id.rv_contact);
    }

    private ArrayList<Contact> loadData(ArrayList<Contact> contacts) {
        contacts.add(new Contact("Bakyt"));
        contacts.add(new Contact("Rahmonberdi"));
        contacts.add(new Contact("Samat"));
        contacts.add(new Contact("Kurmanbek"));
        contacts.add(new Contact("Adylet"));
        contacts.add(new Contact("Kanat"));
        contacts.add(new Contact("Myrzakan"));
        contacts.add(new Contact("Djoomart"));
        contacts.add(new Contact("Adis"));
        contacts.add(new Contact("Asilbek"));
        contacts.add(new Contact("Dilara"));
        contacts.add(new Contact("Altinay"));
        contacts.add(new Contact("Leila"));
        contacts.add(new Contact("Jyrgal"));
        contacts.add(new Contact("Kalima"));
        contacts.add(new Contact("Ayjan"));
        return contacts;
    }

}