package com.DEAiFISH.HongxiuTeam.controller;

import com.DEAiFISH.HongxiuTeam.pojo.Bill;
import com.DEAiFISH.HongxiuTeam.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 查询所有账单 /bill/search --> GET
 * 查询指定日期的账单 /bill/date --> GET
 * <p>
 * 添加记录 /bill/add --> PUT
 * <p>
 * 删除记录 /bill/delete --> DELETE
 */
@Controller
public class BillController {

    @Autowired
    private BillService billService;

    /**
     * 查询所有账单
     *
     * @param map 根据条件查询
     * @return 账单
     */
    @RequestMapping(value = "/bill/all", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Bill> getAllBill(@RequestBody HashMap<String,String> map) {
        return billService.getAllBill(map);
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


    /**
     * 删除指定账单
     *
     * @param bill 账单信息
     * @return
     */
    @RequestMapping(value = "/bill/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteBill(@RequestBody Bill bill) {
        billService.deleteBill(bill);
        return true;
    }

}
