package com.DEAiFISH.HongxiuTeam.mapper;

import com.DEAiFISH.HongxiuTeam.pojo.Member;
import com.DEAiFISH.HongxiuTeam.pojo.Position;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

public interface MemberMapper {

    @Results(id = "memberMapper", value = {
            @Result(column = "me_id", property = "id"),
            @Result(column = "me_name", property = "name"),
            @Result(column = "me_age", property = "age"),
            @Result(column = "me_gender", property = "gender"),
            @Result(column = "me_grade", property = "grade"),
            @Result(column = "me_password", property = "password"),
            @Result(column = "me_position", property = "position", javaType = Position.class)})


    /**
     * 查询所有队员
     * @return 队员列表
     */
    @Select("select * from tb_member")
    ArrayList<Member> getAllMember();

    /**
     * 查询指定队员信息
     *
     * @param member 学生信息
     * @return 队员信息
     */
    @ResultMap("memberMapper")
    @Select("<script> SELECT * FROM tb_member " +
            "<where>" +
            "<if test= \"id != null and id != ''\"> me_id = #{id} </if>" +
            "<if test= \"age != null and age != ''\"> and me_age = #{age} </if>" +
            "<if test= \"gender != null and gender != ''\"> and me_gender = #{gender} </if>" +
            "<if test= \"grade != null and grade != ''\"> and me_grade = #{grade} </if>" +
            "<if test= \"name != null and name != ''\"> and me_name = #{name} </if>" +
            "<if test= \"password != null and password != ''\"> and me_password = #{password} </if>" +
            "<if test= \"position != null and position != ''\"> and me_position = #{position} </if>" +
            "</where>" +
            "</script>")
    ArrayList<Member> searchMember(Member member);


    /**
     * 添加队员
     *
     * @param member 队员信息
     */
    @ResultMap("memberMapper")
    @Insert("insert into tb_member values(#{id},#{name},#{age},#{gender},#{grade},#{password},#{position});")
    void memberSignUp(Member member);


    /**
     * 删除成员
     *
     * @param member 成员信息
     */
    @ResultMap("memberMapper")
    @Delete("delete from tb_member where me_id = #{id}")
    void deleteMember(Member member);

    /**
     * 修改成员
     *
     * @param member 成员新信息
     */
    @ResultMap("memberMapper")
    @Update("update tb_member set me_name = #{name}, me_age = #{age} ,me_grade = #{grade}, " +
            "me_password = #{password},me_position = #{position},me_gender = #{gender} where me_id = #{id}")
    void updateMember(Member member);
}
