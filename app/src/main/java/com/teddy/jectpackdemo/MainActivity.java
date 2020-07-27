package com.teddy.jectpackdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_cxk, tv_jay;
    private Button btn_cxk, btn_jay;

    private CustomViewModel mCustomViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomViewModel = new ViewModelProvider(this).get(CustomViewModel.class);

        tv_cxk = findViewById(R.id.tv_cxk);
        tv_jay = findViewById(R.id.tv_jay);

        tv_cxk.setText(String.valueOf(mCustomViewModel.getTicketcxk()));
        tv_jay.setText(String.valueOf(mCustomViewModel.getTicketjay()));


        btn_cxk = findViewById(R.id.btn_cxk);
        btn_jay= findViewById(R.id.btn_jay);

        btn_cxk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              mCustomViewModel.setTicketcxk(mCustomViewModel.getTicketcxk()+1);
              tv_cxk.setText(String.valueOf(mCustomViewModel.getTicketcxk()));
            }
        });

        btn_jay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCustomViewModel.setTicketjay(mCustomViewModel.getTicketjay()+1);
                tv_jay.setText(String.valueOf(mCustomViewModel.getTicketjay()));
            }
        });



    }
}