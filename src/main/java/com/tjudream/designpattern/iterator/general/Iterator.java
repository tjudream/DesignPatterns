package com.tjudream.designpattern.iterator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 14:34
 *
 * @author mengxs@lenovocloud.com
 */
public interface Iterator {
    //遍历到下一个元素
    public Object next();
    //是否已经遍历到尾部
    public boolean hasNext();
    //删除当前指定的元素
    public boolean remove();
}
