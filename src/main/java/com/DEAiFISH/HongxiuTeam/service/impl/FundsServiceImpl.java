package com.DEAiFISH.HongxiuTeam.service.impl;

import com.DEAiFISH.HongxiuTeam.mapper.FundsMapper;
import com.DEAiFISH.HongxiuTeam.service.FundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FundsServiceImpl implements FundsService {

    @Autowired
    private FundsMapper fundsMapper;
}
