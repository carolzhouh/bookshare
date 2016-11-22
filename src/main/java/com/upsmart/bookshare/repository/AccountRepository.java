package com.upsmart.bookshare.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import com.upsmart.bookshare.domain.Account;

import java.util.List;

/**
 * Copyright (C), 2015, 银联智惠信息服务（上海）有限公司
 *
 * @author qianjc
 * @version 0.0.1
 * @desc account的repository
 * @date 4/8/16
 */
public interface AccountRepository extends PagingAndSortingRepository<Account, String> {

    /**
     * 根据account查找
     * @param account
     * @return
     */
    public Account findByAccount(String account);
}