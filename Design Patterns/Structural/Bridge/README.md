# (Bridge Pattern)[https://refactoring.guru/design-patterns/bridge]

Bridge is a structural design pattern that divides business logic or huge class into separate class hierarchies that can be developed independently.

- Appying inheritance increases the number of subclasses exponentially.
- The Bridge pattern attempts to solve the problem of inheritance by switching from inheritance to the object composition.
- Extract one of the dimensions into a separate class hierarchy, so that the original classes will reference an object of the new hierarchy, instead of having all of its state and behaviors within one class.
