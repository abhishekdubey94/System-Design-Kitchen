# [Builder](https://refactoring.guru/design-patterns/builder)
- Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.
- The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders something like setter methods. There can be multiple builder classes, so an interface should be great.
- Extract a series of calls to the builder steps you use to construct a product into a separate class called director. The director class will call the builder functions.