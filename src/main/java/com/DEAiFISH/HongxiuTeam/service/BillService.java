package com.DEAiFISH.HongxiuTeam.service;

import com.DEAiFISH.HongxiuTeam.pojo.Bill;

import java.util.ArrayList;

public interface BillService {
    ArrayList<Bill> getAllBill();

    void addBill(Bill bill);

    void deleteBill(Bill bill);

}
