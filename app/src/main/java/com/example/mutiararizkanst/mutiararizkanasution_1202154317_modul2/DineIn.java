package com.example.mutiararizkanst.mutiararizkanasution_1202154317_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {
    Button pilihpesanan;// inisiasi tombol pilih pesanan
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);//menghubungkan ke layout DineIn
        pilihpesanan =  (Button) findViewById(R.id.pilihpesanan);



        Toast.makeText(DineIn.this, "Dine In !", Toast.LENGTH_LONG).show();//menampilkan pesan dine in jika memilih dine in
        Intent intent = new Intent( DineIn.this, ListPesanan.class);
    }
}