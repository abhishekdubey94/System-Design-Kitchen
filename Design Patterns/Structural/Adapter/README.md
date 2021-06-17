# Adapter
### Also known as: Wrapper
- Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.
- An adapter wraps one of the objects to hide the complexity of conversion happening behind the scenes. The wrapped object isn’t even aware of the adapter.
- Here’s how it works:
	- The adapter gets an interface, compatible with one of the existing objects.
	- Using this interface, the existing object can safely call the adapter’s methods.
	- Upon receiving a call, the adapter passes the request to the second object, but in a format and order that the second object expects.
- **Object Adapter** : This implementation uses the **object composition principle**: the adapter implements the interface of one object and wraps the other one. It can be implemented in all popular programming languages.
- **Class Adapter** : This implementation uses inheritance: the adapter inherits interfaces from both objects at the same time. Note that this approach can only be implemented in programming languages that support multiple inheritance, such as C++.