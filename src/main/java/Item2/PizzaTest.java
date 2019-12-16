package Item2;

public class PizzaTest {
    NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
            .addTopping(Pizza.Topping.SAUSAGE)
            .addTopping(Pizza.Topping.ONION)
            .build();

    Calzone calzone = new Calzone.Builder()
            .addTopping(Pizza.Topping.HAM)
            .sauceInside()
            .build();
}
