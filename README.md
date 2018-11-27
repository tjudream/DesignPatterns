# DesignPatterns
设计模式

##1. 六大设计原则

### 1.1 单一职责原则(Single Responsibility Principle)
* 定义：不要存在多于一个导致类变更的原因。通俗的说，即一个类只负责一项职责。

### 1.2 里氏替换原则(Law Of Demeter)
* 定义1：如果对每一个类型为S的对象o1，都有类型为T的对象o2，使得以T定义的所有程序P在所有的对象o1都代换成 o2 时，程序 P 的行为没有发生变化，那么类型S是类型T的子类型。
* 定义2：所有引用基类的地方必须能透明地使用其子类的对象。

### 1.3 依赖倒置原则(Dependence Inversion Principle)
* 定义：高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖细节；细节应该依赖抽象。

### 1.4 接口隔离原则(Interface Segregation Principle)
* 定义：客户端不应该依赖它不需要的接口；一个类对另一个类的依赖应该建立在最小的接口上。 

### 1.5 迪米特法则(Liskov Substitution Principle)
* 定义：一个对象应该对其他对象保持最少的了解。

### 1.6 开闭原则(Open Closed Principle)
* 定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。

## 2. 分类：

### 2.1 创建型模式
* 包括6个:
>* [单例模式](src/main/java/com/tjudream/designpattern/singleton/README.md)
>* [简单工厂模式](src/main/java/com/tjudream/designpattern/factory/simplefactory/README.md)
>* [工厂方法模式](src/main/java/com/tjudream/designpattern/factory/factorymethod/README.md)
>* [抽象工厂模式](src/main/java/com/tjudream/designpattern/factory/abstractfactory/README.md)
>* 建造者模式
>* 原型模式
### 2.2 结构型模式
* 包括7个：
>* 适配器模式
>* 桥接模式
>* 组合模式
>* 装饰者模式
>* 外观模式
>* 享元模式
>* 代理模式
### 2.3 行为型模式
* 包括11个
>* 职责链模式
>* 命令模式
>* 解释器模式
>* 迭代器模式
>* 中介者模式
>* 备忘录模式
>* 观察者模式
>* 状态模式
>* 策略模式
>* 模板方法模式
>* 访问者模式
