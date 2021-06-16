# Design Principles

- **SOLID** refers to five design principles in object-oriented programming, designed to reduce code rot and improve the value, function, and maintainability of software
- SOLID principles are class-level, object-oriented design concepts that, in conjunction with an extensive test suite, help you avoid code rot.

        - S : Single Responsibility Principle
        - O : Open-Closed Principle
        - L : Liskov Substitution Principle
        - I : Interface Segregation Principle
        - D : Dependency Inversion Principle

### 1. Single Responsibility Principle

- The Single Responsibility Principle (SRP) states that there should never be more than one reason for a class to change. This means that every class, or similar structure, in your code should have only one job to do.

<details>
        <summary>Example</summary>
        <br>
 
        class Employee {
        public Pay calculatePay() {...}
        public void save() {...}
        public String describeEmployee() {...}
        }

- Here we have pay calculation logic with database logic and reporting logic all mixed up within one class. If you have multiple responsibilities combined into one class, it might be difficult to change one part without breaking others.
- The easiest way to fix this is to split the class into three different classes, with each having only one responsibility: database access, calculating pay, and reporting, all separated.
</details>

### 2. Open-Closed Principle

- The Open-Closed Principle (OCP) states that classes should be open for extension but closed for modification.
- Generally we achieve this by referring to abstractions for dependencies, such as interfaces or abstract classes, rather than using concrete classes. Functionality can be added by creating new classes that implement the interfaces.

### 3. Liskov Substitution Principles (LSP)

- The Liskov Substitution Principle (LSP) applies to inheritance hierarchies, specifying that you should design your classes so that client dependencies can be substituted with subclasses without the client knowing about the change.
