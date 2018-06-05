package org.fx.account.service;

import org.fx.account.model.AccountModel;
import org.fx.utils.ResponseResult;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public interface AccountService {

    ResponseResult<String> save(AccountModel model);

    ResponseResult<String> update(AccountModel model);

    ResponseResult<AccountModel> findByModel(AccountModel model);
}
