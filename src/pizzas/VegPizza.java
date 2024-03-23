package pizzas;

import factory.PizzaType;
import strategies.PrepareStrategy;

public class VegPizza extends BasePizza{


    public VegPizza(PrepareStrategy prepareStrategy) {
        super(prepareStrategy);
        super.pizzaType = PizzaType.VEG;
    }

    @Override
    public int cost() {
        return 10;
    }



    @Override
    public void preparePizza() {
        System.out.println("Preparing Veg Pizza");
        super.prepare();
    }
}
