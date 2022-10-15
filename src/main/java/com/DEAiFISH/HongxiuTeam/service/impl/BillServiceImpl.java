package com.DEAiFISH.HongxiuTeam.service.impl;

import com.DEAiFISH.HongxiuTeam.mapper.BillMapper;
import com.DEAiFISH.HongxiuTeam.pojo.Bill;
import com.DEAiFISH.HongxiuTeam.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BillServiceImpl implements BillService {

    @Autowired
    private BillMapper fundsMapper;

    /**
     * 查询账单
     * @return 余额 + 账单
     */
    @Override
    public Bill searchBill() {

        return fundsMapper.searchBill();
    }
}
