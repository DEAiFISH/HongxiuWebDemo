package com.DEAiFISH.HongxiuTeam.service;


import com.DEAiFISH.HongxiuTeam.pojo.Member;

import java.util.ArrayList;
import java.util.HashMap;

public interface MemberService {

    /**
     * 查询所有队员
     *
     * @param map 排序条件
     * @return 返回列表
     */
    ArrayList<Member> getAllMember(HashMap<String, String> map);

    /**
     * 查询指定队员信息
     *
     * @param map 信息和排序条件
     * @return 查询信息
     */
    ArrayList<Member> searchMember(HashMap<String, String> map);

    /**
     * 注册队员
     *
     * @param member 队员信息
     */
    void memberSignUp(Member member);

    /**
     * 删除队员
     *
     * @param member 队员信息
     */
    void deleteMember(Member member);

    /**
     * 修改队员
     *
     * @param member 新队员信息
     */
    void updateMember(Member member);

    /**
     * 根据ID查询成员
     *
     * @param member ID 和 password
     * @return 成员信息
     */
    Member getMemberById(Member member);
}
