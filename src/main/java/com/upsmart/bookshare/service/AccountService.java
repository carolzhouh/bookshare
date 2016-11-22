package com.upsmart.bookshare.service;

import com.upsmart.bookshare.converter.AccountConverter;
import com.upsmart.bookshare.domain.Account;
import com.upsmart.bookshare.dto.AccountDto;
import com.upsmart.bookshare.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2015, 银联智惠信息服务（上海）有限公司
 *
 * @author qianjc
 * @version 0.0.1
 * @desc account相关的service
 * @date 4/8/16
 */
@Service
public class AccountService {

    private static Logger logger = LoggerFactory.getLogger(AccountService.class);

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AccountConverter accountConverter;

    public AccountDto login(String account) {
        Account accountDb = this.accountRepository.findByAccount(account);
        return this.accountConverter.toDto(accountDb);
    }
}
