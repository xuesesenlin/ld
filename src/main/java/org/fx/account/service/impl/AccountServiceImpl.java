package org.fx.account.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fx.account.model.AccountModel;
import org.fx.account.service.AccountService;
import org.fx.api.AccountApiFeign;
import org.fx.utils.ResponseResult;
import org.fx.utils.feignUtils.FeignRequest;
import org.fx.utils.feignUtils.FeignUtil;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class AccountServiceImpl implements AccountService {

    private AccountApiFeign accountApiFeign = FeignUtil.feign()
            .target(AccountApiFeign.class, new FeignRequest().URL());

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public ResponseResult<String> save(AccountModel model) {
        return new ResponseResult<>();
    }

    @Override
    public ResponseResult<String> update(AccountModel model) {
        return new ResponseResult<>();
    }

    @Override
    public ResponseResult<AccountModel> findByModel(AccountModel model) {
        return accountApiFeign.login(model);
    }
}
