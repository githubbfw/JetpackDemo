package com.teddy.jectpackdemo.databing;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * author : Teddy
 * date   : 2020/7/24
 * desc   :
 */
public class DataBindingViewModel extends ViewModel {
    //这里是2个参数，进行处理数据
    private MutableLiveData<Integer> ticketCxk,ticketJay;

    //实例化这2个参数

    public  MutableLiveData<Integer> getTicketCxk(){
        if (ticketCxk== null){
            ticketCxk = new MutableLiveData<>();
            ticketCxk.setValue(0);
        }
        return  ticketCxk;
    }

    public MutableLiveData<Integer> getTicketJay(){
        if (ticketJay  == null){
            ticketJay = new MutableLiveData<>();
            ticketJay.setValue(0);
        };
        return  ticketJay;
    }



    //添加2个增加数字的的方法
    public  void addCXK(){
        if (ticketCxk.getValue() != null){
            ticketCxk.setValue(ticketCxk.getValue()+1);
        }
    }

    public  void addJay(){
        if (ticketJay.getValue() !=null){
            ticketJay.setValue(ticketJay.getValue()+1);
        }
    }




}
