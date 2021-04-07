package com.example.buttononclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    Bundle bundle = getIntent().getExtras();

    String nama = bundle.getString("a");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");
        switch (nama)
        {
            case "ida":
                tvnama.setText("ida");
                tvnomor.setText("08239938377");
                break;
            case "aqfa":
                tvnama.setText("aqfa AD");
                tvnomor.setText("08973782993");
                break;
            case "tara":
                tvnama.setText("tara cantik");
                tvnomor.setText("08676355662");
                break;
            case "cipa":
                tvnama.setText("cipa syifa");
                tvnomor.setText("08973556267");
                break;
            case "sela":
                tvnama.setText("sela cantik");
                tvnomor.setText("08575266737");
                break;
            case "repa":
                tvnama.setText("repalina");
                tvnomor.setText("086752455166");
                break;
            case "eka":
                tvnama.setText("eka ganteng");
                tvnomor.setText("08674243567");
                break;
            case "husna":
                tvnama.setText("amalia husna");
                tvnomor.setText("089725543567");
                break;
            case "indro":
                tvnama.setText("indro ganteng");
                tvnomor.setText("087268999370");
                break;
            case "inayah":
                tvnama.setText("inayah r");
                tvnomor.setText("0867535677772");
                break;

        }
    }
}