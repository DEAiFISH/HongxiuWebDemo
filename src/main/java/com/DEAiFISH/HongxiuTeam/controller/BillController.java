package com.DEAiFISH.HongxiuTeam.controller;

import com.DEAiFISH.HongxiuTeam.pojo.Bill;
import com.DEAiFISH.HongxiuTeam.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * 查询记录 /Funds/search --> GET
 *
 * 添加记录 /Funds/add --> PUT
 *
 */
@Controller
public class BillController {

    @Autowired
    private BillService fundsService;

    /**
     *  查询账单
     *  @return 余额 + 账单
     */
    @RequestMapping(value = "/Funds/search",method = RequestMethod.GET,produces = "application/html;charset=utf-8")
    public Bill searchFunds(){
        return fundsService.searchBill();
    }



}
