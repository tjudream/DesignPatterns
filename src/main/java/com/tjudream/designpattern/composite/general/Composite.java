package com.tjudream.designpattern.composite.general;

import java.util.ArrayList;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 11:18
 *
 * @author mengxs@lenovocloud.com
 */
public class Composite extends Component {
    //构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();
    //增加一个叶子构件或树枝构件
    public void add(Component component) {
        this.componentArrayList.add(component);
    }
    //删除一个叶子构件或树枝构件
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }
    //获得分支下所有叶子构件和树枝构件

    public ArrayList<Component> getChildren() {
        return componentArrayList;
    }
}
