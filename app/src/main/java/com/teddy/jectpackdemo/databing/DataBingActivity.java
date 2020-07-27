package com.teddy.jectpackdemo.databing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.teddy.jectpackdemo.R;
import com.teddy.jectpackdemo.databinding.ActivityDataBingBinding;

public class DataBingActivity extends AppCompatActivity {

    private DataBindingViewModel mModel;
//    private Button btn_cxk, btn_jay;

    private ActivityDataBingBinding mBinding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_data_bing);
//        setContentView(R.layout.activity_data_bing);

        mModel = new ViewModelProvider(this).get(DataBindingViewModel.class);
        mBinding.setData(mModel);
        mBinding.setLifecycleOwner(this);


//        btn_cxk = findViewById(R.id.btn_cxk);
//        btn_jay= findViewById(R.id.btn_jay);


        //在布局文件中，添加了databingding就不需要 去用这个去监听，不然项目会报错，

//        mModel.getTicketCxk().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//                mBinding.tvCxk.setText(String.valueOf(mModel.getTicketCxk().getValue()));
//            }
//        });
//
//        mModel.getTicketJay().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//                mBinding.tvJay.setText(String.valueOf(mModel.getTicketJay().getValue()));
//            }
//        });


//        btn_cxk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mModel.addCXK();
//            }
//        });
//
//        btn_jay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mModel.addJay();
//            }
//        });

    }
}