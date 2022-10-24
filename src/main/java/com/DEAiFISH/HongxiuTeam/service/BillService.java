package com.DEAiFISH.HongxiuTeam.service;

import com.DEAiFISH.HongxiuTeam.pojo.Bill;

import java.util.ArrayList;
import java.util.HashMap;

public interface BillService {
    ArrayList<Bill> getAllBill(HashMap<String, String> map);

    void addBill(Bill bill);

    void deleteBill(Bill bill);

}
