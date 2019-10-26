package com.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DaftarMahasiswa extends AppCompatActivity {
    EditText nama, nim, alamat, email;
    TextView hnama, hnim, halamat, hemail;
    Button btnsimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_mahasiswa);

        nama = (EditText)findViewById(R.id.input_nama);
        nim = (EditText)findViewById(R.id.input_nim);
        alamat = (EditText)findViewById(R.id.input_alamat);
        email = (EditText)findViewById(R.id.input_email);
        hnama = (TextView)findViewById(R.id.hasil_nama);
        hnim = (TextView)findViewById(R.id.hasil_nim);
        halamat = (TextView)findViewById(R.id.hasil_alamat);
        hemail = (TextView)findViewById(R.id.hasil_email);
        btnsimpan = (Button)findViewById(R.id.simpan_button);
    }

    public void pindah(View view) {
        Intent intent = new Intent(DaftarMahasiswa.this, DaftarDosen.class);
    }
}
