package com.DEAiFISH.HongxiuTeam.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Funds {
    /**
     * 总金额
     */
    private BigDecimal money;
    /**
     * 账单列表
     */
    private List<Bill> listOfBill;

    /**
     * 懒汉式：创建单例模式
     */
    private static Funds instance;

    public static synchronized Funds getInstance(){
        if(instance == null){
            instance = new Funds(BigDecimal.valueOf(0),new ArrayList<Bill>());
        }
        return instance;
    }

    private Funds(BigDecimal money, List<Bill> listOfBill) {
        this.money = money;
        this.listOfBill = listOfBill;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public List<Bill> getListOfBill() {
        return listOfBill;
    }

    public void setListOfBill(List<Bill> listOfBill) {
        this.listOfBill = listOfBill;
    }
}
