package com.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DaftarMataKuliah extends AppCompatActivity {
    EditText kode, nanamatkul,  sks, hari, sesi;
    TextView hkode, hnamamatkul, hsks, hhari, hsesi;
    Button btnsimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_mata_kuliah);

        kode = (EditText)findViewById(R.id.input_kode);
        nanamatkul = (EditText)findViewById(R.id.input_namamatkul);
        sks = (EditText)findViewById(R.id.input_sks);
        hari = (EditText)findViewById(R.id.input_hari);
        sesi = (EditText)findViewById(R.id.input_sesi);
        hkode = (TextView)findViewById(R.id.hasil_kode);
        hnamamatkul = (TextView)findViewById(R.id.hasil_namamatkul);
        hsks = (TextView)findViewById(R.id.hasil_sks);
        hhari = (TextView)findViewById(R.id.hasil_hari);
        hsesi = (TextView)findViewById(R.id.hasil_sesi);
        btnsimpan = (Button)findViewById(R.id.simpan_button);
    }

    public void pindah(View view) {
        Intent intent = new Intent(DaftarMataKuliah.this, DaftarAdmin.class);
    }
}
