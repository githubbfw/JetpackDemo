package com.teddy.jectpackdemo.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * author : Teddy
 * date   : 2020/7/24
 * desc   : 使用livedata进行数据的处理
 */
public class LiveDataViewModel extends ViewModel {

     // 这个地方用 LiveData 进行处理
    private MutableLiveData<Integer> ticketcxk, ticketjay;

    //写2个方法得到这个2个值
    public MutableLiveData<Integer> getTicketcxk() {
        if (ticketcxk == null) {
            ticketcxk = new MutableLiveData<>();
            //为空就给一个默认值
            ticketcxk.setValue(0);
        }
        return ticketcxk;
    }


    public MutableLiveData<Integer> getTicketjay() {
        if (ticketjay == null) {
            ticketjay = new MutableLiveData<>();
            ticketjay.setValue(0);
        }
        return ticketjay;
    }

    // 添加一个数据增加的方法
    public void addJay(){
        if (ticketjay.getValue() != null){
            ticketjay.setValue(ticketjay.getValue()+1);
        }
    }

    public void addCXK(){
        if (ticketcxk.getValue() != null){
            ticketcxk.setValue(ticketcxk.getValue()+1);
        }
    }


}
