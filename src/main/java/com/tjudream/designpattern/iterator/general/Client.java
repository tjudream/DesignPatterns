package com.tjudream.designpattern.iterator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 14:42
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("abc");
        aggregate.add("123");
        aggregate.add("456");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
