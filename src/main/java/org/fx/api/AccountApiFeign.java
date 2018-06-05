package org.fx.api;

import feign.Body;
import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.fx.account.model.AccountModel;
import org.fx.utils.ResponseResult;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public interface AccountApiFeign {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @RequestLine("POST /login/login")
    @Body("model={model}")
    ResponseResult<AccountModel> login(@Param("model") AccountModel model);
}
