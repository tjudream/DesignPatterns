package com.tjudream.designpattern.interpreter.general;

import java.util.Stack;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 13:47
 *
 * @author mengxs@lenovocloud.com
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        //通常定义一个语法容器，容纳一个具体的表达式，通常为ArrayList，LinkedList，Stack等类型
        Stack<Expression> stack = null;
        for (int i = 0; i < stack.size(); i++) {
            //进行语法判断，并产生递归调用
        }
        //产生一个完整的语法树，又各个具体的语法分析进行解析
        Expression exp = stack.pop();
        //具体元素进入场景
        exp.interpreter(ctx);
    }
}
