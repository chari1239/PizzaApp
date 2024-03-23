package pizzas;

import factory.PizzaType;
import strategies.PrepareStrategy;

public class BasePizza extends Pizza {

    PrepareStrategy prepareStrategy;

    PizzaType pizzaType;

    public BasePizza(PrepareStrategy prepareStrategy){
        this.prepareStrategy = prepareStrategy;
    }

    @Override
    public int cost() {
        return 5;
    }

    @Override
    public void preparePizza() {
        System.out.println("Preparing Normal Pizza");
    }

    public void prepare(){
        prepareStrategy.prepare();
    }

    public PizzaType getPizzaType(){
        return pizzaType;
    }
}
