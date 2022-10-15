package com.DEAiFISH.HongxiuTeam.service;


import com.DEAiFISH.HongxiuTeam.pojo.Member;

import java.util.ArrayList;

public interface MemberService {
    ArrayList<Member> getAllMember();

    ArrayList<Member> searchMember(Member member);

    void memberSignUp(Member member);

    void deleteMember(Member member);

    void updateMember(Member member);
}
