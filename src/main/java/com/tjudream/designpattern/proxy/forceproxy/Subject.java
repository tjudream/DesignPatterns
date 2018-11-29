package com.tjudream.designpattern.proxy.forceproxy;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 17:02
 *
 * @author mengxs@lenovocloud.com
 */
public interface Subject {
    public void request();
    public Subject getProxy();
}
