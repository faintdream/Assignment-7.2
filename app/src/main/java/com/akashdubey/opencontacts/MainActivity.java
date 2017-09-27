package com.akashdubey.opencontacts;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button contacts;
    Intent launcher= new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI); //declaring intent
                                                                                            //ACTION_PICK returns a selected item
                                                                                            // CONTENT_URI is content style UR for Contacts table
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contacts =(Button) findViewById(R.id.contacts);                                    // binding button object to button view
        contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchContacts();                                                           //calling user function
            }
        });

    }


    public void launchContacts(){
        startActivity(launcher);                                                           //calling the contact activity

    }

}
