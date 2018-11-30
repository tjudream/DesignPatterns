package com.tjudream.designpattern.iterator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 14:40
 *
 * @author mengxs@lenovocloud.com
 */
public interface Aggregate {
    //是容器必然有元素的增加
    public void add(Object object);
    //减少元素
    public void remove(Object object);
    //用迭代器来遍历元素
    public Iterator iterator();
}
