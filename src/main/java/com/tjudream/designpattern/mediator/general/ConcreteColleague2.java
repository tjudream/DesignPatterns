package com.tjudream.designpattern.mediator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 15:10
 *
 * @author mengxs@lenovocloud.com
 */
public class ConcreteColleague2 extends Colleague {
    //通过构造函数传递中介者
    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }
    //自由方法self-method
    public void selfMethod2() {
        //处理自己的业务逻辑
    }
    //依赖方法dep-method
    public void depMethod2() {
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }
}
