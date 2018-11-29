package com.tjudream.designpattern.composite.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 11:21
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.operation();
        //创建一个树枝构件
        Composite branch = new Composite();
        // 创建一个叶子节点
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }
    public static void display(Composite root) {
        for (Component c : root.getChildren()) {
            if (c instanceof Leaf) {
                //叶子节点
                c.operation();
            } else {
                //树枝节点
                display((Composite) c);
            }
        }
    }
}
