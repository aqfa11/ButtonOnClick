package com.example.buttononclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edmail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btnmasuk);
        edmail=findViewById(R.id.isiemail);
        edpassword=findViewById(R.id.isipass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            String email,sandi;

            @Override
            public void onClick(View v) {
                email= "tara@email.com";
                sandi="345";

                nama=edmail.getText().toString();
                password=edpassword.getText().toString();

                if(nama.equals(email) && password.equals(sandi)){
                    Toast benar2 = Toast.makeText(getApplicationContext(),
                            "Login BERHASIL",Toast.LENGTH_LONG);
                    benar2.show();
                }

                else if(nama.equals(email)){
                    Toast emailbenar = Toast.makeText(getApplicationContext(),
                            "Password SALAH",Toast.LENGTH_LONG);
                    emailbenar.show();
                }

                else if(password.equals(sandi)){
                    Toast sandibenar = Toast.makeText(getApplicationContext(),
                            "E-Mail SALAH",Toast.LENGTH_LONG);
                    sandibenar.show();
                }

                else {
                    Toast semuasalah = Toast.makeText(getApplicationContext(),
                            "E-Mail dan Password SALAH", Toast.LENGTH_LONG);
                    semuasalah.show();
                }

//                Toast t =Toast.makeText(getApplicationContext(),
//                        "E-Mail anda: " + nama +" dan Password anda: "+password,Toast.LENGTH_LONG);
//                t.show();
            }
        });
    }
}