package pizzas;

import factory.PizzaType;

public abstract class Pizza implements MakePizza {

    public abstract int cost();

    public abstract void prepare();

    public abstract PizzaType getPizzaType();


}
