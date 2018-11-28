package com.tjudream.designpattern.bridge.general;

import com.tjudream.designpattern.bridge.general.abstraction.Abstraction;
import com.tjudream.designpattern.bridge.general.abstraction.impl.RefinedAbstraction;
import com.tjudream.designpattern.bridge.general.implementor.Implementor;
import com.tjudream.designpattern.bridge.general.implementor.impl.ConcreteImplementor1;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 21:44
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor1();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.request();
    }
}
