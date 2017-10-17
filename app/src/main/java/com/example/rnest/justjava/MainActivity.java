package com.example.rnest.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text_panjang;
    private EditText text_lebar;
    private TextView text_luas;
    private Button btn_hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_panjang = (EditText) findViewById(R.id.text_panjang);
        text_lebar   = (EditText) findViewById(R.id.text_lebar);
        btn_hitung   = (Button) findViewById(R.id.btn_hitung);
        text_luas    = (TextView) findViewById(R.id.text_luas);

        btn_hitung.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View view){
                String panjang = text_panjang.getText().toString().trim();
                String lebar   = text_lebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);
                double luas = p*l;

                text_luas.setText("Luas: " + luas);
            }
        });
    }
}
