package com.DEAiFISH.HongxiuTeam.controller;

import com.DEAiFISH.HongxiuTeam.pojo.Bill;
import com.DEAiFISH.HongxiuTeam.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * 查询记录 /Bill/search --> GET
 * <p>
 * 添加记录 /Bill/add --> PUT
 */
@Controller
public class BillController {

    @Autowired
    private BillService billService;

    /**
     * 查询所有账单
     *
     * @return 账单
     */
    @RequestMapping(value = "/bill/all", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Bill> getAllBill() {
        return billService.getAllBill();
    }


    /**
     * 添加账单
     *
     * @param bill 账单信息
     * @return 账单信息列表
     */
    @RequestMapping(value = "/bill/add", method = RequestMethod.PUT)
    @ResponseBody
    public boolean addBill(@RequestBody Bill bill) {
        billService.addBill(bill);
        return true;
    }


}
