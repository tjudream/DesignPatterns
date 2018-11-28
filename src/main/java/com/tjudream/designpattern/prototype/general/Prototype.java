package com.tjudream.designpattern.prototype.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 15:58
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Prototype implements Cloneable {
    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
