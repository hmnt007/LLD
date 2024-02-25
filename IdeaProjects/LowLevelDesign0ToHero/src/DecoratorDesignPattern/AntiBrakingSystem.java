package DecoratorDesignPattern;

public class AntiBrakingSystem extends BikeDecorator {
    TvsBike tvsBike;
    private static final int ANTI_BRAKING_SYSTEM_PRICE = 20000;
    AntiBrakingSystem(TvsBike tvsBike) {
        this.tvsBike = tvsBike;
    }
    @Override
    int cost() {
        System.out.println("Additional Cost of Anti Braking System is " + ANTI_BRAKING_SYSTEM_PRICE);
        return tvsBike.cost() + ANTI_BRAKING_SYSTEM_PRICE;
    }
}
