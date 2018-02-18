package com.example.mutiararizkanst.mutiararizkanasution_1202154317_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        Toast.makeText(TakeAway.this, "Take Away !", Toast.LENGTH_LONG).show();// menampilkan pesan Take Away jika pengguna
        // memilih pesanan takeAway
    }
    }
