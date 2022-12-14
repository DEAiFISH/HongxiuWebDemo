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
 * 查询是否存在 /member/contains --> GET
 * <p>
 * 注册队员 /member/signup --> POST
 * <p>
 * 修改队员 /member/update --> PUT
 * <p>
 * 删除队员 /member/delete --> DELETE
 *
 * @author DEAiFISH
 */


@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * 查询所有队员
     *
     * @param map 根据条件查询
     * @return Json格式的队员列表
     */
    @RequestMapping(value = "/member/all", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Member> getAllMember(@RequestBody HashMap<String, String> map) {
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
    public ArrayList<Member> searchMember(@RequestBody HashMap<String, String> map) {
        return memberService.searchMember(map);
    }


    /**
     * 登录
     *
     * @param member id 和 password
     * @return true:登录成功;false:登录失败
     */
    @RequestMapping(value = "/member/login", method = RequestMethod.GET)
    @ResponseBody
    public boolean memberLogin(@RequestBody Member member) {
        return memberService.getMemberById(member) != null;
    }


    /**
     * 查询是否存在
     *
     * @param member Id
     * @return true:存在;false:不存在;
     */
    @RequestMapping(value = "/member/contains", method = RequestMethod.GET)
    @ResponseBody
    public boolean containsMemberById(@RequestBody Member member) {
        return memberService.getMemberById(member) != null;
    }

    /**
     * 注册队员
     *
     * @param member id
     * @return true:注册成功;false:注册失败
     */
    @RequestMapping(value = "/member/signup", method = RequestMethod.POST, produces = "application/html;charset=utf-8")
    @ResponseBody
    public boolean memberSignUp(@RequestBody Member member) {
        if (memberService.getMemberById(member) == null) {
            memberService.memberSignUp(member);
            return true;
        }
        return false;
    }

    /**
     * 删除队员
     *
     * @param member Id
     * @return true:删除成功;false:删除失败
     */
    @RequestMapping(value = "/member/delete", method = RequestMethod.DELETE, produces = "application/html;charset=utf-8")
    @ResponseBody
    public boolean deleteMember(@RequestBody Member member) {
        if (memberService.getMemberById(member) != null) {
            memberService.deleteMember(member);
            return true;
        }
        return false;
    }


    /**
     * 修改成员
     *
     * @param member Id
     * @return true:修改成功;false:修改失败
     */
    @RequestMapping(value = "/member/update", method = RequestMethod.PUT, produces = "application/html;charset=utf-8")
    @ResponseBody
    public boolean updateMember(@RequestBody Member member) {
        if (memberService.getMemberById(member) != null) {
            memberService.updateMember(member);
            return true;
        }
        return false;
    }


}
