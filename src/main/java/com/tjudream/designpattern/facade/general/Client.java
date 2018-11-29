package com.tjudream.designpattern.facade.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 14:45
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.warpOperation();
    }
}
