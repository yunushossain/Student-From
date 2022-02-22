package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    EditText name, email, phone, address;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.tfstName);
        email = findViewById(R.id.tfEmail);
        phone = findViewById(R.id.tfPhone);
        address = findViewById(R.id.tfAddress);
        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(
                view -> {
                    System.out.println(name.getText());
                    System.out.println(email.getText());
                    System.out.println(phone.getText());
                    System.out.println(address.getText());
                }
        );

    }



}