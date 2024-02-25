package DecoratorDesignPattern;

public class SlipperClutch extends BikeDecorator {
    TvsBike tvsBike;
    private static final int CLUTCH_PRICE = 3000;
    SlipperClutch(TvsBike tvsBike) {
        this.tvsBike = tvsBike;
    }
    @Override
    int cost() {
        System.out.println("Additional Cost of Slipper Clutch is " + CLUTCH_PRICE);
        return tvsBike.cost() + CLUTCH_PRICE;
    }
}
