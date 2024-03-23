package factory;

import pizzas.ChickenPizza;
import pizzas.Pizza;
import pizzas.VegPizza;
import strategies.NormalSpicy;
import strategies.PrepareStrategy;

public class PizzaFactory {


    public Pizza getPizza(PizzaType pizzaType){

        PrepareStrategy prepareStrategy = new NormalSpicy();

        return switch (pizzaType) {
            case VEG -> new VegPizza(prepareStrategy);
            case CHICKEN -> new ChickenPizza(prepareStrategy);
        };

    }


}
