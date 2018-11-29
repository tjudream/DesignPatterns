package com.tjudream.designpattern.proxy.dynamicproxy;

import com.tjudream.designpattern.facade.general.SystemC;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 18:24
 *
 * @author mengxs@lenovocloud.com
 */
public class RealSubject implements Subject {
    @Override
    public void request(String str) {
        System.out.println("do something!--->" + str);
    }
}
