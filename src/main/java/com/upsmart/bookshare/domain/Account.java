package com.upsmart.bookshare.domain;

import javax.persistence.*;

/**
 * Copyright (C), 2015, 银联智惠信息服务（上海）有限公司
 *
 * @author qianjc
 * @version 0.0.1
 * @desc account的domain
 * @date 4/8/16
 */
@Entity
@Table(name = "account")
public class Account {

    // id
    @Id
    @Column(name = "account", unique = true, nullable = false)
    private String account;

    // 名字
    @Column(name = "name")
    private String name;
    
    // email
    @Column(name = "eamil", length = 32)
    private String email;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
