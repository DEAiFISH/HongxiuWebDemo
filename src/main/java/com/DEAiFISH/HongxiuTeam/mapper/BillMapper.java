package com.DEAiFISH.HongxiuTeam.mapper;

import com.DEAiFISH.HongxiuTeam.pojo.Bill;
import org.apache.ibatis.annotations.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public interface BillMapper {

    @Results(id = "billMapper", value = {
            @Result(column = "fu_uid", property = "uid"),
            @Result(column = "fu_amount", property = "amount"),
            @Result(column = "fu_description", property = "description"),
            @Result(column = "fu_me_id", property = "meId"),
            @Result(column = "fu_date", property = "date", javaType = Date.class)
    })


    /**
     * 查询所有账单
     *
     * @param map 根据条件查询
     * @return 账单列表
     */
    @Select("select * from tb_bill order by ${property} ${way}")
    ArrayList<Bill> getAllBill(HashMap<String, String> map);

    /**
     * 添加账单
     *
     * @param bill 账单信息
     */
    @ResultMap("billMapper")
    @Insert("insert into tb_bill values(#{uid},#{amount},#{description},#{meId},#{date});")
    void addBill(Bill bill);


    /**
     * 删除账单
     *
     * @param bill 账单信息
     */
    @Delete("delete from tb_bill where fu_uid = #{uid};")
    @ResultMap("billMapper")
    void deleteBill(Bill bill);

}
