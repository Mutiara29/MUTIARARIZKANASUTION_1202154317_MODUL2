package com.example.mutiararizkanst.mutiararizkanasution_1202154317_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Pesanan extends AppCompatActivity {

    ListView simpleList;
    String nama[] = {"1. Dine In", "2. Take Away"};


    private Button a ;//inisiasi tombol a
    private TextView b;//inisiasi tombol b
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);//menghubungkan ke layout pesanan

        a = (Button) findViewById(R.id.keluar);

        b = (TextView) findViewById(R.id.nama);

        Intent c = getIntent();

        final String username = c.getStringExtra("username");

        b.setText(username);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b =  new Intent(Pesanan.this,MainActivity.class);
                startActivity(b);//memulai aktivitas b

            }
        });

        simpleList = (ListView) findViewById(R.id.listview);
        CustomAdapterList customAdapter = new CustomAdapterList(getApplicationContext(),nama);
        simpleList.setAdapter(customAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent a = new Intent(Pesanan.this,DineIn.class);
                        a.putExtra("nama",username);
                        a.putExtra("judul","1.Dine In");
                        startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent(Pesanan.this,TakeAway.class);
                        b.putExtra("nama",username);
                        b.putExtra("judul","2. Take Away");
                        startActivity(b);
                        break;
                }
            }
        });
    }
}
