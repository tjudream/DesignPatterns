package com.tjudream.designpattern.iterator.general;

import java.util.Vector;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 14:36
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    //定义当前游标
    public int cursor = 0;

    @SuppressWarnings("uncheck")
    public ConcreteIterator(Vector _vertor) {
        this.vector = _vertor;
    }
    //返回下一个元素
    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        }
        return result;
    }
    //判断是否达到尾部
    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        }
        return true;
    }

    //删除当前元素
    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
