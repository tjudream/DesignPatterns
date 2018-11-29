package com.tjudream.designpattern.decorator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 11:46
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Decorator extends Component {
    private Component component = null;
    public Decorator(Component component) {
        this.component = component;
    }
    @Override
    public void operate() {
        this.component.operate();
    }
}
