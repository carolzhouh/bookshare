package com.upsmart.bookshare.controller;


import com.upsmart.bookshare.dto.AccountDto;
import com.upsmart.bookshare.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C), 2015, 银联智惠信息服务（上海）有限公司
 *
 * @author qianjc
 * @version 0.0.1
 * @desc 账户controller
 * @date 4/8/16
 */
@Controller
@RequestMapping("account")
public class AccountController {

    private static Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "apply", method = RequestMethod.POST)
    @ResponseBody
    public AccountDto login(@RequestParam(value = "account", required = true) String account) {
        return this.accountService.login(account);
    }
}