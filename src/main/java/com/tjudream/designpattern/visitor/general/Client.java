package com.tjudream.designpattern.visitor.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-12-02 19:33
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //获得元素对象
            Element e1 = ObjectStruture.createElement();
            //接受访问者访问
            e1.accept(new Visitor());
        }
    }
}
