package com.DEAiFISH.HongxiuTeam.service.impl;

import com.DEAiFISH.HongxiuTeam.mapper.MemberMapper;
import com.DEAiFISH.HongxiuTeam.pojo.Member;
import com.DEAiFISH.HongxiuTeam.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    /**
     * 查询所有队员
     *
     * @return 返回列表
     */
    @Override
    public ArrayList<Member> getAllMember(HashMap<String, String> map) {
        return memberMapper.getAllMember(map);
    }

    /**
     * 查询指定队员信息
     *
     * @param map 信息和排序条件
     * @return 查询信息
     */
    @Override
    public ArrayList<Member> searchMember(HashMap<String, String> map) {
        return memberMapper.searchMember(map);
    }

    /**
     * 注册队员
     *
     * @param member 队员信息
     */
    @Override
    public void memberSignUp(Member member) {
        memberMapper.memberSignUp(member);
    }

    /**
     * 删除队员
     *
     * @param member 队员信息
     */
    @Override
    public void deleteMember(Member member) {
        memberMapper.deleteMember(member);
    }

    /**
     * 修改队员
     *
     * @param member 新队员信息
     */
    @Override
    public void updateMember(Member member) {
        memberMapper.updateMember(member);
    }

    /**
     * 根据ID查询成员
     *
     * @param member ID 和 password
     * @return
     */
    @Override
    public Member getMemberById(Member member) {
        return memberMapper.getMemberById(member);
    }
}
