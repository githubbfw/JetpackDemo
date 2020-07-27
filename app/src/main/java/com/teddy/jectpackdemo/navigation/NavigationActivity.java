package com.teddy.jectpackdemo.navigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.teddy.jectpackdemo.R;

public class NavigationActivity extends AppCompatActivity {

    /**
     * @param savedInstanceState
     *    主要是讲解，navigation 的用法
     * 1. NavGraph ---显示fragment的视图
     * 2. NavHost ----- fragment的容器
     * 3. NavController----对fragment的逻辑---进行管理  --比如切换
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        //这个R.id.fragment就是Activity布局里fragment控件的id
        NavController navController  = Navigation.findNavController(this,R.id.fragment3);
        // 申明一个appbar
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(bottomNavigationView.getMenu()).build();

        NavigationUI.setupActionBarWithNavController(this,navController,appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);



    }
}