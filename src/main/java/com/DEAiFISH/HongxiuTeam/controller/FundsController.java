package com.DEAiFISH.HongxiuTeam.controller;

import com.DEAiFISH.HongxiuTeam.service.FundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * 查询记录 /Funds/search -->
 *
 * 添加记录 /Funds/add --> PUT
 *
 */
@Controller
public class FundsController {

    @Autowired
    private FundsService fundsService;



}
