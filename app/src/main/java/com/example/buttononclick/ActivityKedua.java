package com.example.buttononclick;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    TextView txEmail, txPass;
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        txEmail=findViewById(R.id.emailH2);
        txPass=findViewById(R.id.passH2);

        Bundle bundle =getIntent().getExtras();

        String email=bundle.getString("a");
        String pass=bundle.getString("b");

        txEmail.setText(email);
        txPass.setText(pass);
    }
}
