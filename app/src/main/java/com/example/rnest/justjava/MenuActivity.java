package com.example.rnest.justjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by RnEST on 10/17/2017.
 */

public class MenuActivity extends AppCompatActivity {
    private Button btn_lingkaran, btn_persegi, btn_persegi_panjang, btn_segitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btn_lingkaran = (Button) findViewById(R.id.btn_lingkaran);
        btn_persegi   = (Button) findViewById(R.id.btn_persegi);
        btn_persegi_panjang = (Button) findViewById(R.id.btn_persegi_panjang);
        btn_segitiga = (Button) findViewById(R.id.btn_segitiga);

        btn_lingkaran.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){}
        });

        btn_persegi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){}
        });

        btn_persegi_panjang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_segitiga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){}
        });
    }
}
