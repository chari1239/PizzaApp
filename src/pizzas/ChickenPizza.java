package pizzas;

import factory.PizzaType;
import strategies.PrepareStrategy;

public class ChickenPizza extends BasePizza{

    public ChickenPizza(PrepareStrategy prepareStrategy) {
        super(prepareStrategy);
        super.pizzaType = PizzaType.CHICKEN;
    }

    @Override
    public int cost() {
        return 20;
    }

    @Override
    public void preparePizza() {
        System.out.println("Preparing Chicken Pizza");
        super.prepare();
    }
}
