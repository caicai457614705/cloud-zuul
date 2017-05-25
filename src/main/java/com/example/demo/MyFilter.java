package com.example.demo;

import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;

/**
 * Created by faker on 17/5/24.
 */
//@Component
public class MyFilter extends ZuulFilter {

    //过滤类型 pre-过滤之前 routing-路由之时 post-路由之后 error 发送错误调用
    @Override
    public String filterType() {
        return "pre";
    }

    //过滤的顺序
    @Override
    public int filterOrder() {
        return 0;
    }

    //判断逻辑, 是否要过滤
    @Override
    public boolean shouldFilter() {
        return false;
    }

    //过滤器的具体逻辑 , 可以查数据库  各种判断  等等
    @Override
    public Object run() {
        return null;
    }
}
