# [Abstract Factory](https://refactoring.guru/design-patterns/abstract-factory)
- Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
- The first thing the Abstract Factory pattern suggests is to explicitly declare interfaces for each distinct product of the product family (e.g., chair, sofa or coffee table). Then you can make all variants of products follow those interfaces.
- Abstract Factory�an interface with a list of creation methods for all products that are part of the product family. These methods must return abstract product types represented by the interfaces we extracted previously.
- For each variant of a product family, we create a separate factory class based on the AbstractFactory interface. A factory is a class that returns products of a particular kind. 