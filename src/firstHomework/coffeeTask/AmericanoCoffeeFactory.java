package firstHomework.coffeeTask;

public class AmericanoCoffeeFactory extends CoffeeFactory{
    @Override
    public Coffee makeCoffee() {
        return new Americano();
    }
}
