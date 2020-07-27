package com.teddy.jectpackdemo.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.teddy.jectpackdemo.R;

public class LiveDataActivity extends AppCompatActivity {

    private TextView tv_cxk, tv_jay;
    private Button btn_cxk, btn_jay;

    private  LiveDataViewModel mLiveDataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);

        mLiveDataViewModel = new ViewModelProvider(this).get(LiveDataViewModel.class);

        tv_cxk = findViewById(R.id.tv_cxk);
        tv_jay = findViewById(R.id.tv_jay);

        btn_cxk = findViewById(R.id.btn_cxk);
        btn_jay= findViewById(R.id.btn_jay);


        mLiveDataViewModel.getTicketcxk().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tv_cxk.setText(String.valueOf(mLiveDataViewModel.getTicketcxk().getValue()));
            }
        });

        mLiveDataViewModel.getTicketjay().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                tv_jay.setText(String.valueOf(mLiveDataViewModel.getTicketcxk().getValue()));
            }
        });


        btn_cxk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   mLiveDataViewModel.addCXK();
            }
        });

        btn_jay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mLiveDataViewModel.addJay();
            }
        });




    }
}