package com.tjudream.designpattern.decorator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 11:45
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
