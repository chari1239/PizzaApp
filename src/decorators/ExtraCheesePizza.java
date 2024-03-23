package decorators;

import factory.PizzaType;
import pizzas.Pizza;

public class ExtraCheesePizza extends Toppings {

    Pizza pizza;

    public ExtraCheesePizza(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public void preparePizza() {
        System.out.println( pizza.getPizzaType() +  " with Extra Cheese" );
        this.pizza.prepare();
    }

    @Override
    public int cost() {
        return pizza.cost() + 5;
    }

    @Override
    public void prepare() {
        this.pizza.prepare();
    }

    @Override
    public PizzaType getPizzaType() {
        return this.pizza.getPizzaType();
    }


}
