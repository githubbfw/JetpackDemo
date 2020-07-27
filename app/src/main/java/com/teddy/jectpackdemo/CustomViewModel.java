package com.teddy.jectpackdemo;

import androidx.lifecycle.ViewModel;

/**
 * author : Teddy
 * date   : 2020/7/24
 * desc   : viewmodel
 */
public class CustomViewModel extends ViewModel {
    //声明2个变量
    private  int ticketcxk = 0;
    private  int ticketjay = 0;

    public int getTicketcxk() {
        return ticketcxk;
    }

    public void setTicketcxk(int ticketcxk) {
        this.ticketcxk = ticketcxk;
    }

    public int getTicketjay() {
        return ticketjay;
    }

    public void setTicketjay(int ticketjay) {
        this.ticketjay = ticketjay;
    }
}
