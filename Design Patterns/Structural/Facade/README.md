# Facade
- Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.
- Facade is handy when you need to integrate your app with a sophisticated library that has dozens of features, but you just need a tiny bit of its functionality.
- The facade should redirect the calls from the client code to appropriate objects of the subsystem. The facade should be responsible for initializing the subsystem and managing its further life cycle unless the client code already does this.