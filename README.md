# DesignPatterns
设计模式
## 1. 六大设计原则
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
>* [建造者模式](src/main/java/com/tjudream/designpattern/builder/README.md)
>* [原型模式](src/main/java/com/tjudream/designpattern/prototype/README.md)
### 2.2 结构型模式
* 包括7个：
>* [适配器模式](src/main/java/com/tjudream/designpattern/adapter/README.md)
>* [桥接模式](src/main/java/com/tjudream/designpattern/builder/README.md)
>* [组合模式](src/main/java/com/tjudream/designpattern/composite/README.md)
>* [装饰者模式](src/main/java/com/tjudream/designpattern/decorator/README.md)
>* [门面模式](src/main/java/com/tjudream/designpattern/facade/README.md)
>* [享元模式](src/main/java/com/tjudream/designpattern/flyweight/README.md)
>* [代理模式](src/main/java/com/tjudream/designpattern/proxy/README.md)
### 2.3 行为型模式
* 包括11个
>* [责任链模式](src/main/java/com/tjudream/designpattern/chainofresponsibility/README.md)
>* [命令模式](src/main/java/com/tjudream/designpattern/composite/README.md)
>* [解释器模式](src/main/java/com/tjudream/designpattern/interpreter/README.md)
>* [迭代器模式](src/main/java/com/tjudream/designpattern/iterator/README.md)
>* [中介者模式](src/main/java/com/tjudream/designpattern/mediator/README.md)
>* [备忘录模式](src/main/java/com/tjudream/designpattern/memento/README.md)
>* [观察者模式](src/main/java/com/tjudream/designpattern/observer/README.md)
>* [状态模式](src/main/java/com/tjudream/designpattern/state/README.md)
>* [策略模式](src/main/java/com/tjudream/designpattern/strategy/README.md)
>* [模板方法模式](src/main/java/com/tjudream/designpattern/templatemethod/README.md)
>* [访问者模式](src/main/java/com/tjudream/designpattern/visitor/README.md)

## 3.参考资料
* 《设计模式之禅》
* [Graphic Design Patterns](https://design-patterns.readthedocs.io)