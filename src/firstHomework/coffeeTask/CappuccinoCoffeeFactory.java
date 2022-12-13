package firstHomework.coffeeTask;

public class CappuccinoCoffeeFactory extends CoffeeFactory{
    @Override
    public Coffee makeCoffee() {
        return new Cappuccino();
    }
}
