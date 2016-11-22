package com.upsmart.bookshare.converter;

import com.upsmart.bookshare.domain.Account;
import com.upsmart.bookshare.dto.AccountDto;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2015, 银联智惠信息服务（上海）有限公司
 *
 * @author qianjc
 * @version 0.0.1
 * @desc 账户domain和dto的相互转换
 * @date 4/8/16
 */
@Component
public class AccountConverter {

    /**
     * domain转换为dto
     * @param account
     * @return
     */
    public AccountDto toDto(Account account) {
        if (null != account) {
            AccountDto accountDto = new AccountDto();
            accountDto.setAccount(account.getAccount());
            accountDto.setEmail(account.getEmail());
            accountDto.setName(account.getName());
            return accountDto;
        }
        return null;
    }
}
