package com.example.sqlitedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        //Inserting Contacts
        Log.d("Insert: ", "Inserting...");
        db.addContact(new Contact("Raju Lama", "1234567"));
        db.addContact(new Contact("Pramod Kharel", "12345899"));
        db.addContact(new Contact("David J. Malan", "1234569890"));

        //Reading all contacts
        Log.d("Reading: ", "Fetching...");
        List<Contact> contacts = db.getAllContacts();

        for (Contact contact : contacts){
            String log = "Id: " + contact.getId() +
                    " ,Name: " + contact.getName() +
                    " ,Phone: " + contact.getPhoneNumber();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }
    }
}