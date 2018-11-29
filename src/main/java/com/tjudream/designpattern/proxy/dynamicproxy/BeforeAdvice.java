package com.tjudream.designpattern.proxy.dynamicproxy;

import com.tjudream.designpattern.facade.general.SystemC;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 18:32
 *
 * @author mengxs@lenovocloud.com
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("前置通知");
    }
}
