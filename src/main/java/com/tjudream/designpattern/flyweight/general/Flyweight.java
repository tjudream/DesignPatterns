package com.tjudream.designpattern.flyweight.general;

/**
 * 描述:
 * <p>
 * Created by mengxiansen on 2018-11-29 15:39
 *
 * @author mengxs@lenovocloud.com
 */
public abstract class Flyweight {
    //内部状态
    private String intrinsic;
    //外部状态
    protected final String extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }
    //定义业务操作
    public abstract void operate();
    //内部状态的getter/setter

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
