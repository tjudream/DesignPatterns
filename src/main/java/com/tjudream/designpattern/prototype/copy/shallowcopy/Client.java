package com.tjudream.designpattern.prototype.copy.shallowcopy;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 16:14
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Thing thing = new Thing();
        thing.setValue("zhangsan");
        Thing clone = thing.clone();
        clone.setValue("lisi");
        thing.setValue("shallowcoyp");
        System.out.println(clone.getValues());
    }
}
