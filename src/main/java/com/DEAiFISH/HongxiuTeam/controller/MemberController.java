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
import java.util.HashMap;

/**
 * 查询所有队员 /member/all --> GET
 * 查询指定队员 /member/search --> GET
 * 队员登录 /member/login --> GET
 * <p>
 * 注册队员 /member/signup --> POST
 * <p>
 * 修改队员 /member/update --> PUT
 * <p>
 * 删除队员 /member/delete --> DELETE
 */


@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * 查询所有队员
     * @param map 根据条件查询
     * @return Json格式的队员列表
     */
    @RequestMapping(value = "/member/all", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Member> getAllMember(@RequestBody HashMap<String,String> map) {
        return memberService.getAllMember(map);
    }


    /**
     * 查询指定队员
     *
     * @param map 信息和排序条件
     * @return Json格式的队员列表
     */
    @RequestMapping(value = {"/member/search"}, method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Member> searchMember(@RequestBody HashMap<String,String> map) {
        return memberService.searchMember(map);
    }


    /**
     * 登录
     *
     * @param map 信息和排序条件
     * @return
     */
    @RequestMapping(value = "/member/login", method = RequestMethod.GET)
    @ResponseBody
    public boolean memberLogin(@RequestBody HashMap<String,String> map) {
        ArrayList<Member> member = memberService.searchMember(map);
        if (member.isEmpty()) {
            return false;
        }
        return true;
    }


    /**
     * 查询是否存在
     *
     * @param map 根据条件查询
     * @return true:ok;false:no;
     */
    @RequestMapping(value = "/member/contains", method = RequestMethod.GET)
    @ResponseBody
    public boolean containsMemberById(@RequestBody HashMap<String,String> map) {
        ArrayList<Member> memberList = memberService.searchMember(map);
        if (memberList.isEmpty()) {
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
     * 删除队员
     *
     * @param member 队员信息
     * @return
     */
    @RequestMapping(value = "/member/delete", method = RequestMethod.DELETE, produces = "application/html;charset=utf-8")
    @ResponseBody
    public String deleteMember(@RequestBody Member member) {

        memberService.deleteMember(member);

        return "删除成功";
    }


    /**
     * 修改成员
     *
     * @param member 成员新信息
     * @return
     */
    @RequestMapping(value = "/member/update", method = RequestMethod.PUT, produces = "application/html;charset=utf-8")
    @ResponseBody
    public String updateMember(@RequestBody Member member) {
        memberService.updateMember(member);
        return "修改成功";
    }


}
