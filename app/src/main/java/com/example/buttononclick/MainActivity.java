package com.example.buttononclick;

import android.content.Intent;
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
                email= "Aqfa Tara";
                sandi="345";

                nama=edmail.getText().toString();
                password=edpassword.getText().toString();

                if(nama.isEmpty() || password.isEmpty()){
                    Toast t=Toast.makeText(getApplicationContext(),
                            "Email dan Password harus DIISI!!!", Toast.LENGTH_LONG);
                    t.show();
                }

                else if(nama.equals(email) && password.equals(sandi)){
                    Toast benar2 = Toast.makeText(getApplicationContext(),
                            "Login BERHASIL",Toast.LENGTH_LONG);
                    benar2.show();

                    Bundle b = new Bundle();

                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());

                    Intent i=new Intent(getApplicationContext(), ActivityKedua.class);

                    i.putExtras(b);

                    startActivity(i);
                }
                else {
                    Toast semuasalah = Toast.makeText(getApplicationContext(),
                            "Login GAGAL", Toast.LENGTH_LONG);
                    semuasalah.show();
                }

//                Toast t =Toast.makeText(getApplicationContext(),
//                        "E-Mail anda: " + nama +" dan Password anda: "+password,Toast.LENGTH_LONG);
//                t.show();
            }
        });
    }
}