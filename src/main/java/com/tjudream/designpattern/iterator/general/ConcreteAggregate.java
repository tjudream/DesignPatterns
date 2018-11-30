package com.tjudream.designpattern.iterator.general;

import java.util.Vector;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 14:41
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteAggregate implements Aggregate {
    //容纳对象的容器
    private Vector vector = new Vector();
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
