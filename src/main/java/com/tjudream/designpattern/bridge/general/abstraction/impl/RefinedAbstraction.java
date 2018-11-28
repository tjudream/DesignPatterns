package com.tjudream.designpattern.bridge.general.abstraction.impl;

import com.tjudream.designpattern.bridge.general.abstraction.Abstraction;
import com.tjudream.designpattern.bridge.general.implementor.Implementor;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-28 21:39
 *
 * @author mengxs@lenovocloud.com
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    @Override
    public void request() {
        super.request();
        super.getImplementor().doAnything();
    }
}
