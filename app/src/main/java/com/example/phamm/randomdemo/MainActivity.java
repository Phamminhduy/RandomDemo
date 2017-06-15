package com.example.phamm.randomdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtView;
    EditText mintext, maxtext;
    Button btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String min = mintext.getText().toString();
                String max = maxtext.getText().toString();
                if(min.length()==0||max.isEmpty()){
                    Toast.makeText(MainActivity.this,"Vui Lòng Nhập Đủ Số",Toast.LENGTH_SHORT).show();
                }else{
                int somin = Integer.parseInt(min);
                int somax = Integer.parseInt(max);
                Random random = new Random();
                int number = random.nextInt(somax - somin + 1) + somin;
                txtView.setText(number+"");
            }}
        });
    }
    private void Anhxa(){
        txtView = (TextView) findViewById(R.id.KQ);
        btnRandom = (Button) findViewById(R.id.button);
        mintext = (EditText) findViewById(R.id.min);
        maxtext = (EditText) findViewById(R.id.max);
    }
}
