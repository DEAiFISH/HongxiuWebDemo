package com.DEAiFISH.HongxiuTeam.controller;

import com.DEAiFISH.HongxiuTeam.pojo.Member;
import com.DEAiFISH.HongxiuTeam.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询所有队员 /member/all --> GET
 * 查询指定队员 /member/search --> GET
 * 队员登录 /member/login --> GET
 *
 * 注册队员 /member/signup --> POST
 *
 * 修改队员 /member/update --> PUT
 *
 * 删除队员 /member/delete --> DELETE
 */


@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * 查询所有队员
     *
     * @return Json格式的队员列表
     */
    @RequestMapping(value = "/member/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Member> getAllMember() {
        ArrayList<Member> allMember = memberService.getAllMember();
        allMember.forEach(System.out::println);
        return allMember;
    }


    /**
     * 查询指定队员
     *
     * @return Json格式的队员列表
     */
    @RequestMapping(value = {"/member/search"}, method = RequestMethod.GET)
    @ResponseBody
    public List<Member> searchMember(@RequestBody Member member) {
        return memberService.searchMember(member);
    }


    /**
     * 登录
     *
     * @param member id和password
     * @return
     */
    @RequestMapping(value = "/member/login", method = RequestMethod.GET)
    @ResponseBody
    public boolean memberLogin(@RequestBody Member member) {
        ArrayList<Member> m = memberService.searchMember(member);
        if (m.size() != 0) {
            return true;
        }

        return false;
    }


    /**
     * 查询是否存在
     *
     * @param member 传入id
     * @return true:ok;false:no;
     */
    @RequestMapping(value = "/member/contains", method = RequestMethod.GET)
    @ResponseBody
    public boolean containsMemberById(@RequestBody Member member) {
        ArrayList<Member> memberList = memberService.searchMember(new Member(member.getId()));
        if (memberList.size() != 0) {
            return false;
        }

        return true;
    }

    /**
     * 注册队员
     *
     * @param member 队员信息
     * @return
     */
    @RequestMapping(value = "/member/signup", method = RequestMethod.POST, produces = "application/html;charset=utf-8")
    @ResponseBody
    public String memberSignUp(@RequestBody Member member) {
        memberService.memberSignUp(member);
        return "注册成功";
    }

    /**
     *  删除队员
     *
     * @param member 队员信息
     * @return
     */
    @RequestMapping(value = "/member/delete", method = RequestMethod.DELETE,produces = "application/html;charset=utf-8")
    @ResponseBody
    public String deleteMember(@RequestBody Member member) {

        memberService.deleteMember(member);

        return "删除成功";
    }


    /**
     * 修改成员
     * @param member 成员新信息
     * @return
     */
    @RequestMapping(value = "/member/update",method = RequestMethod.PUT,produces = "application/html;charset=utf-8")
    @ResponseBody
    public String updateMember(@RequestBody Member member){
        memberService.updateMember(member);
        return "修改成功";
    }


}
