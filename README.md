# DesignPatterns
A general solution to a commonly occuring problem in software design.
### Creational Pattern
Design patterns that involve instantiating concrete objects.
##### 1- Singleton Pattern
refers to having only one object of a class which is globally accessible within the program. 
The idea is to give the class a private constructor so the constructor cannot be called from outside the class.
There are two components to create an object of this class without a public constructor:
1. Declare a private class variable to refer to the one instance of your Singleton class.
2. Create a public method in the class that will create an instance of this class, but only if an instance does exist already.

##### 2- Factory Method
The intent is to define an interface for creating objects, but let the subclasses decide which class to instantiate.

### Structural Pattern
Design patterns that describe how objects are connected to one another.
##### 1- Facade Pattern
Provide a single simplified interface for client classes to interact with the subsystem(The client should not know anything about the subsystem classes).

##### 2- Adapter Pattern
To help facilitate comunication between two existing systems by providing a compatible interface.

##### 3- Composite Pattern
To compose nested structures of objects and to deal with the classes for these objects uniformly.

### Sources
Design Patterns on [Coursera](https://www.coursera.org/learn/design-patterns/).
