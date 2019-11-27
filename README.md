# Design-Patterns

Design principles:
1- Identify the aspects of your application that vary and separate them from what stays the same” or Encapsulate what varies.
2- Program to an interface (supertype), not an implementation.
	Programming to implementation: Dog d= new Dog();
	Programming to interface: Animal animal= new Dog();
3- Favor composition over inheritance.
4- Strive for loosely coupled designs between objects that interact. (Flexible & easy to handle changes)

GOF's:

Creational: 
Class (Factory method)
Object (Abstract Factory, singleton, prototype, builder)

Structural:
Class (Adapter class)
Object (Adapter object, facade, proxy, decorator, composite, bridge, flyweight)

Behavioral:
Class (Template method, Interpreter)
Object (chain of responsibility, command, iterator, mediator, memento, observer, state, strategy, visitor)

Open-Closed Principle - classes should be opened for extension, but closed for modification.

The Principle of Least Knowledge to reduce the interactions between objects to just a few close friends - talk only to your immediate friends.
