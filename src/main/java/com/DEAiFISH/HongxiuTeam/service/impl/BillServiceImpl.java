package com.DEAiFISH.HongxiuTeam.service.impl;

import com.DEAiFISH.HongxiuTeam.mapper.BillMapper;
import com.DEAiFISH.HongxiuTeam.pojo.Bill;
import com.DEAiFISH.HongxiuTeam.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@Transactional
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper billMapper;

    /**
     * 查询所有账单
     *
     * @param map 根据条件查询
     * @return 账单
     */
    @Override
    public ArrayList<Bill> getAllBill(HashMap<String, String> map) {

        return billMapper.getAllBill(map);
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


    /**
     * 删除账单
     *
     * @param bill 账单信息
     */
    @Override
    public void deleteBill(Bill bill) {
        billMapper.deleteBill(bill);
    }


}
