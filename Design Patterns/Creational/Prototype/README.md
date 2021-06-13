# Prototype
### Also known as: Clone
- Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.
- We cannot copy an objects field which are private to the class.
- The pattern declares a common interface for all objects that support cloning. This interface lets you clone an object without coupling your code to the class of that object. Usually, such an interface contains just a single clone method.