package com.bk.ducnghia.event2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button tong;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tong = findViewById(R.id.text_tong);
        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText soa = findViewById(R.id.text_a);
                EditText sob = findViewById(R.id.text_b);
                TextView dapan = findViewById(R.id.text_da);
                int a=Integer.parseInt(soa.getText()+"");
                int b=Integer.parseInt(sob.getText()+"");
                dapan.setText((a+b)+"");
            }
        });
    }
}
