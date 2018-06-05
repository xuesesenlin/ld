package org.fx.utils.feignUtils;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.fx.utils.token.TokenStatic;

/**
 * @author ld
 * @name 统一对feign添加头部请求
 * @table
 * @remarks
 */
public class FeignInterceptor implements RequestInterceptor {

    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("token", TokenStatic.token);
    }
}
