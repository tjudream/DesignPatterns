package com.tjudream.designpattern.proxy.dynamicproxy;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 18:31
 *
 * @author mengxs@lenovocloud.com
 */
public interface IAdvice {
    //通知只有一个方法，执行即可
    public void exec();
}
