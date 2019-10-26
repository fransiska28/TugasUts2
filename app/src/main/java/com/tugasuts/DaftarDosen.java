package com.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DaftarDosen extends AppCompatActivity {
    EditText nama, nidn,  alamat, email, gelar;
    TextView hnama, hnidn, halamat, hemail, hgelar;
    Button btnsimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_dosen);

        nama = (EditText)findViewById(R.id.input_nama);
        nidn = (EditText)findViewById(R.id.input_nidn);
        alamat = (EditText)findViewById(R.id.input_alamat);
        email = (EditText)findViewById(R.id.input_email);
        gelar = (EditText)findViewById(R.id.input_gelar);
        hnama = (TextView)findViewById(R.id.hasil_nama);
        hnidn = (TextView)findViewById(R.id.hasil_nidn);
        halamat = (TextView)findViewById(R.id.hasil_alamat);
        hemail = (TextView)findViewById(R.id.hasil_email);
        hgelar = (TextView)findViewById(R.id.hasil_gelar);
        btnsimpan = (Button)findViewById(R.id.simpan_button);
    }

    public void pindah(View view) {
        Intent intent = new Intent(DaftarDosen.this, DaftarAdmin.class);
    }
}
