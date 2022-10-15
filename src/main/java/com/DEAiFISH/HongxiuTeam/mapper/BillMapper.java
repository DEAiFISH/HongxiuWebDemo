package com.DEAiFISH.HongxiuTeam.mapper;

import com.DEAiFISH.HongxiuTeam.pojo.Bill;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface BillMapper {

    @Results(id="fundsMapper",value = {
                    @Result(column = "fu_uid",property = "uid"),
                    @Result(column = "fu_amount",property = "amount"),
                    @Result(column = "fu_description",property = "description"),
                    @Result(column = "fu_me_id",property = "meID"),
                    @Result(column = "fu_date",property = "date")
    })


    /**
     * 查询账单
     * @return 金额 + 账单
     */
    @Select("select * from tb_funds")
    Bill searchBill();

}
