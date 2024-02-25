package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        TvsBike roninBike = new DigitalMeter(new SlipperClutch(new AntiBrakingSystem(new Ronin())));
        System.out.println("$$$ Your Ronin Bike Price is " + roninBike.cost());
        TvsBike apacheBike = new AntiBrakingSystem(new DigitalMeter(new Apache()));
        System.out.println("$$$ Your Apache Bike Price is " + apacheBike.cost());
        TvsBike riderBike = new SlipperClutch(new DigitalMeter(new Apache()));
        System.out.println("$$$ Your Rider Bike Price is " + riderBike.cost());
    }
}
