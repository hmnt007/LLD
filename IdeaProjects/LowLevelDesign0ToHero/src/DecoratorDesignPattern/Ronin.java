package DecoratorDesignPattern;

public class Ronin extends TvsBike{
    private static final int BASE_PRICE = 180000;

    @Override
    int cost() {
        System.out.println("Base Cost of your bike is  " + BASE_PRICE);
        return BASE_PRICE;
    }
}
