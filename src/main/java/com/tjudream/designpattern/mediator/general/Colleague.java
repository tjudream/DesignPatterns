package com.tjudream.designpattern.mediator.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-30 15:09
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator) {
        this.mediator = _mediator;
    }
}
