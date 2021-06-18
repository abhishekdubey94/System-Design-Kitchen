# Decorator
### Also known as: Wrapper
- Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
- A wrapper is an object that can be linked with some target object. The wrapper contains the same set of methods as the target and delegates to it all requests it receives. However, the wrapper may alter the result by doing something either before or after it passes the request to the target.
- The wrapper implements the same interface as the wrapped object.
- Composite and Decorator have similar structure diagrams since both rely on recursive composition to organize an open-ended number of objects.