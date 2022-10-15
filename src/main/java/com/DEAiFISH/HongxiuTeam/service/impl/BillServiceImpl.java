package com.DEAiFISH.HongxiuTeam.service.impl;

import com.DEAiFISH.HongxiuTeam.mapper.BillMapper;
import com.DEAiFISH.HongxiuTeam.pojo.Bill;
import com.DEAiFISH.HongxiuTeam.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    /**
     * 查询所有账单
     *
     * @return 账单
     */
    @Override
    public ArrayList<Bill> getAllBill() {

        return billMapper.getAllBill();
    }

    /**
     * 查询账单
     *
     * @param bill 账单信息
     */
    @Override
    public void addBill(Bill bill) {
        billMapper.addBill(bill);
    }
}
