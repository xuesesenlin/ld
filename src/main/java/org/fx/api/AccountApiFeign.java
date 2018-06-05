package org.fx.api;

import feign.Body;
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

    @RequestLine("POST /api/account/login")
    @Body("json={json}")
    ResponseResult<String> login(@Param("json") String json);

    @RequestLine("GET /api/account/sj/code/{token}")
    ResponseResult<AccountModel> sjCode(@Param("token") String token);

    @RequestLine("POST /api/account/update")
    @Body("pass={pass}&token={token}")
    ResponseResult<String> updatePWD(@Param("pass") String pass, @Param("token") String token);

    @RequestLine("POST /api/register/register")
    @Body("json={json}")
    ResponseResult<String> register(@Param("json") String json);
}
