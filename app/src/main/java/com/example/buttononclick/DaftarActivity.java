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
                if(edtNama.getText().toString().length()==0){
                    //jika nama belum di isi / masih kosong
                    edtNama.setError("perlu nama");
                }

                if(edtEmail.getText().toString().length()==0){
                    //jika alamat belum di isi / masih kosong
                    edtAlamat.setError("alamat diperlukan");
                }

                if(edtAlamat.getText().toString().length()==0){
                    //jika email belum di isi / masih kosong
                    edtEmail.setError("Email diperlukan!");
                }

                if(edtPass.getText().toString().length()==0){
                    //jika Passwrod belum di isi / masih kosong
                    edtPass.setError("Password diperlukan");
                }else if(edtPass.getText().toString().length()!=6){
                    edtPass.setError("Panjang Password kurang dari 6 huruf");
                }

                if(edtRepass.getText().toString().length()==0 || edtRepass.equals(edtPass)){
                    //jika ulang Passwrod belum di isi / masih kosong
                    edtRepass.setError("Ulangi Password diperlukan!");

                }

                if(edtNama.length() != 0 && edtAlamat.length() != 0 && edtEmail.length() != 0 && edtPass.length() !=0 && edtPass.length() == 6 && edtPass.getText() ==edtRepass.getText()){
                    Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",
                            Toast.LENGTH_SHORT).show();
                    //ke layout Main activity
                    Intent i =  new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }

            }
        });


    }
}
