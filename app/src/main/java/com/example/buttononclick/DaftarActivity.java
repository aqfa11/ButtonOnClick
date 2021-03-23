package com.example.buttononclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class DaftarActivity extends AppCompatActivity {

    EditText edtNama,edtAlamat,edtEmail,edtPass,edtRepass;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        edtNama=findViewById(R.id.edNama);
        edtEmail=findViewById(R.id.edEmail);
        edtAlamat=findViewById(R.id.edAlamat);
        edtPass=findViewById(R.id.edPass);
        edtRepass=findViewById(R.id.edRepass);
        fab=findViewById(R.id.fabSimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty()||
                        edtEmail.getText().toString().isEmpty()||
                        edtPass.getText().toString().isEmpty()||
                        edtRepass.getText().toString().isEmpty())
                {
                    Snackbar.make(v, "Wajib ISI Seluruh Data!!!",Snackbar.LENGTH_SHORT).show();
                }
                else {
                    if(edtPass.getText().toString().equals(edtRepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil...",
                                Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                    }
                    else {
                        Snackbar.make(v, "Password dan Repassword Harus Sama!!!", Snackbar.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}