# [Factory Method](https://refactoring.guru/design-patterns/factory-method)

#### Also known as: Virtual Constructor

- Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
- The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method. Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method. Objects returned by a factory method are often referred to as products.
- There’s a slight limitation though: subclasses may return different types of products only if these products have a common base class or interface. Also, the factory method in the base class should have its return type declared as this interface.
- Note, despite its name, product creation is not the primary responsibility of the creator. Usually, the creator class already has some core business logic related to products. The factory method helps to decouple this logic from the concrete product classes.

#### [Difference between factory method and abstract factory](https://stackoverflow.com/questions/13029261/design-patterns-factory-vs-factory-method-vs-abstract-factory)

- With the Factory pattern, you produce instances of implementations (Apple, Banana, Cherry, etc.) of a particular interface -- say, IFruit. With the Abstract Factory pattern, you provide a way for anyone to provide their own factory. This allows your warehouse to be either an IFruitFactory or an IJuiceFactory, without requiring your warehouse to know anything about fruits or juices.
