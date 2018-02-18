package com.example.mutiararizkanst.mutiararizkanasution_1202154317_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static int splashInterval = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //menghubungkan activity pesanan ke mainactivity dengan menggunakan intent
                Intent i = new Intent(MainActivity.this, Pesanan.class);
                startActivity(i);

                Toast.makeText(MainActivity.this, "MUTIARARIZKANASUTION_1202154317", Toast.LENGTH_LONG).show();

                //jeda selesai MainActivity
                this.finish();
            }

            private void finish(){

            }
        }, splashInterval);
    }
}
