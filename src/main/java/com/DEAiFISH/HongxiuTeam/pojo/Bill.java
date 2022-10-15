package com.DEAiFISH.HongxiuTeam.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    /**
     * 流水号
     */
    private Integer uid;
    /**
     * 时间
     */
    private Date date;
    /**
     * 花费金额
     */
    private BigDecimal amount;
    /**
     * 描述
     */
    private String description;
    /**
     * 成员ID
     */
    private Integer meID;

    public Bill() {
    }

    public Bill(Integer uid, Date date, BigDecimal amount, String description, Integer meID) {
        this.uid = uid;
        this.date = date;
        this.amount = amount;
        this.description = description;
        this.meID = meID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMeID() {
        return meID;
    }

    public void setMeID(Integer meID) {
        this.meID = meID;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "uid=" + uid +
                ", date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", meID=" + meID +
                '}';
    }
}
