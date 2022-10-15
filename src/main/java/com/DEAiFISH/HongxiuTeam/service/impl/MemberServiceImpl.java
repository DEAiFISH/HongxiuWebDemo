package com.DEAiFISH.HongxiuTeam.service.impl;

import com.DEAiFISH.HongxiuTeam.mapper.MemberMapper;
import com.DEAiFISH.HongxiuTeam.pojo.Member;
import com.DEAiFISH.HongxiuTeam.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    /**
     * 查询所有队员
     * @return  返回列表
     */
    @Override
    public ArrayList<Member> getAllMember() {
        return memberMapper.getAllMember();
    }


    /**
     * 查询指定队员信息
     * @param member 学生信息
     * @return 查询信息
     */
    @Override
    public ArrayList<Member> searchMember(Member member) {
        return memberMapper.searchMember(member);
    }

    /**
     * 注册队员
     * @param member 队员信息
     */
    @Override
    public void memberSignUp(Member member) {
        memberMapper.memberSignUp(member);
    }


    /**
     * 删除队员
     * @param member 队员信息
     */
    @Override
    public void deleteMember(Member member) {
        memberMapper.deleteMember(member);
    }
}
