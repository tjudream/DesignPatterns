package com.tjudream.designpattern.proxy.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 17:07
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = new Proxy(subject);
        proxy.request();
    }
}
