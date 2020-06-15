# DesignPatterns
### Creational Pattern
##### 1- Singleton Pattern
refers to having only one object of a class which is globally accessible within the program. 
The idea is to give the class a private constructor so the constructor cannot be called from outside the class.
There are two components to create an object of this class without a public constructor:
1. Declare a private class variable to refer to the one instance of your Singleton class.
2. Create a public method in the class that will create an instance of this class, but only if an instance does exist already.
