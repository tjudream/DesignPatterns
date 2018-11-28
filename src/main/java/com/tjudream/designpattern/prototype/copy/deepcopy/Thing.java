package com.tjudream.designpattern.prototype.copy.deepcopy;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 16:12
 *
 * @author mengxs@lenovocloud.com
 */
public class Thing implements Cloneable {
    private ArrayList<String> list = new ArrayList<>();
    @Override
    public Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing)super.clone();
            thing.list = (ArrayList<String>) this.list.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
    public void setValue(String value) {
        this.list.add(value);
    }
    public ArrayList<String> getValues() {
        return this.list;
    }
}
