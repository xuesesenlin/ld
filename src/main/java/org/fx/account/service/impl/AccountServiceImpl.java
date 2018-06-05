package org.fx.account.service.impl;

import org.fx.account.model.AccountModel;
import org.fx.account.service.AccountService;
import org.fx.utils.ResponseResult;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class AccountServiceImpl implements AccountService {

    @Override
    public ResponseResult<String> save(AccountModel model) {
        return new ResponseResult<>();
    }

    @Override
    public ResponseResult<String> update(AccountModel model) {
        return new ResponseResult<>();
    }

    @Override
    public ResponseResult<String> findByAccount(String account) {
        if (account.equals("1"))
            return new ResponseResult<>(true, "成功");
        else
            return new ResponseResult<>();
    }
}
