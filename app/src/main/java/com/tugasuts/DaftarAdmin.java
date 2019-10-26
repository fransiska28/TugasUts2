package com.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DaftarAdmin extends AppCompatActivity {
    EditText nama, alamat, email;
    TextView hnama, halamat, hemail;
    Button btnsimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_admin);

        nama = (EditText)findViewById(R.id.input_nama);
        alamat = (EditText)findViewById(R.id.input_alamat);
        email = (EditText)findViewById(R.id.input_email);
        hnama = (TextView)findViewById(R.id.hasil_nama);
        halamat = (TextView)findViewById(R.id.hasil_alamat);
        hemail = (TextView)findViewById(R.id.hasil_email);
        btnsimpan = (Button)findViewById(R.id.simpan_button);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama1, alamat1, email1;
                nama1 = nama.getText().toString().trim();
                alamat1 = alamat.getText().toString().trim();
                email1 = email.getText().toString().trim();
                hnama.setText(nama1);
                halamat.setText(alamat1);
                hemail.setText(email1);
            }
        });
    }

    public void pindah(View view) {
        Intent intent = new Intent(DaftarAdmin.this, DaftarMataKuliah.class);
    }
}
