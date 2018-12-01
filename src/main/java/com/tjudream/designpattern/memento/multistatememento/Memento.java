package com.tjudream.designpattern.memento.multistatememento;

import java.util.HashMap;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 19:05
 *
 * @author mengxs@lenovocloud.com
 */
public class Memento {
    //接受HashMap作为状态
    private HashMap<String,Object> stateMap;
    //接受一个对象，建立一个备份
    public Memento(HashMap<String,Object> map) {
        this.stateMap = map;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
