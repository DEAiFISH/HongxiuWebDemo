package com.DEAiFISH.HongxiuTeam.service;


import com.DEAiFISH.HongxiuTeam.pojo.Member;

import java.util.ArrayList;
import java.util.HashMap;

public interface MemberService {
    ArrayList<Member> getAllMember(HashMap<String,String> map);

    ArrayList<Member> searchMember(HashMap<String,String> map);

    void memberSignUp(Member member);

    void deleteMember(Member member);

    void updateMember(Member member);

    Member getMemberById(Member member);
}
