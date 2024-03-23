import factory.PizzaType;
import pizzas.ChickenPizza;
import pizzas.Pizza;
import decorators.ExtraCheesePizza;
import factory.PizzaFactory;
import pizzas.VegPizza;
import strategies.PrepareSpicy;
import strategies.PrepareStrategy;
import strategies.PrepareSweet;

public class Main {
    public static void main(String[] args) {
        System.out.println("------DESIGN PATTERNS !-------");
        System.out.println();
        // Factory Pattern
        System.out.println("-----FACTORY PATTERN-----");
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza vegPizza  = pizzaFactory.getPizza(PizzaType.VEG);
        vegPizza.preparePizza();
        System.out.println(vegPizza.cost());

        Pizza chickenPizza = pizzaFactory.getPizza(PizzaType.CHICKEN);
        chickenPizza.preparePizza();
        System.out.println(chickenPizza.cost());

        // Decorator Pattern
        System.out.println("-----DECORATOR PATTERN-----");
        Pizza vegExtraCheesePizza  = new ExtraCheesePizza(vegPizza);
        vegExtraCheesePizza.preparePizza();
        System.out.println(vegExtraCheesePizza.cost());

        // Strategy Pattern
        System.out.println("-----STRATEGY PATTERN-----");
        PrepareStrategy spicyStrategy = new PrepareSpicy();
        Pizza vegSpicyPizza = new VegPizza(spicyStrategy);
        vegSpicyPizza.preparePizza();
        System.out.println(vegSpicyPizza.cost());

        PrepareStrategy sweetStrategy = new PrepareSweet();
        Pizza chickenSweetPizza = new ChickenPizza(sweetStrategy);
        chickenSweetPizza.preparePizza();
        System.out.println(chickenSweetPizza.cost());

        // Decorator on top of Strategy
        System.out.println("-----STRATEGY & DECORATOR PATTERN-----");
        Pizza extraCheeseSpicyPizza = new ExtraCheesePizza(vegSpicyPizza);
        extraCheeseSpicyPizza.preparePizza();
        System.out.println(extraCheeseSpicyPizza.cost());


    }
}