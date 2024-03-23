# PizzaApp - Design Patterns

## Factory Design Pattern ##
  
Provides different Objects/implementations of similar class based on the input.

In this example,

enum PizzaType -> VEG, CHICKEN

Two different implementations of Pizza are sent by PizzaFactory based on the input.

VEG --> VegPizza

CHICKEN --> ChickenPizza.


## Decorator Pattern ##

If customer wants extra cheese - this will be like a decoration on top of pizza.

So we create a new class in which it will have a Normal Pizza and extra thing - 

In this example we increased the cost on top of normal pizza.

## Strategy Pattern ##

Suppose if customer wants Pizza to be Spicy - this is like changing the behaviour/taste/making of the Pizza.

So we should pass the strategy while creating the Pizza itself.

In this example, we are sending the PreparationStrategy via Construction injection in to the Pizza class.


### Conclusion ###

Hope this makes you understand the design pattern, I will try to add Observable Pattern as well.




