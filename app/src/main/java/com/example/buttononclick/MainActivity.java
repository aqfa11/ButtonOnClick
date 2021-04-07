package com.example.buttononclick;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edmail, edpassword;

    String nama, password;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.mnDaftar){
            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btnmasuk);
        edmail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPass);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            String email,sandi;

            @Override
            public void onClick(View v) {
                email= "admin@mail.com";
                sandi="123456";

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

                    Intent i=new Intent(getApplicationContext(), Home_Activity.class);

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