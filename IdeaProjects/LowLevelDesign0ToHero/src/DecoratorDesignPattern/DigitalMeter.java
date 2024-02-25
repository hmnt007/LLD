package DecoratorDesignPattern;

public class DigitalMeter extends BikeDecorator {
    TvsBike tvsBike;
    private static final int DIGITAL_METER_PRICE = 15000;
    DigitalMeter(TvsBike tvsBike) {
        this.tvsBike = tvsBike;
    }
    @Override
    int cost() {
        System.out.println("Additional Cost of Slipper Digital meter is " + DIGITAL_METER_PRICE);
        return tvsBike.cost() + DIGITAL_METER_PRICE;
    }
}
