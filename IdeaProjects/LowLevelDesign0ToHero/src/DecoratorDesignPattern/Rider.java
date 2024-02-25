package DecoratorDesignPattern;

public class Rider extends TvsBike{
    private static final int BASE_PRICE = 120000;

    @Override
    int cost() {
        System.out.println("Base Cost of your bike is  " + BASE_PRICE);
        return BASE_PRICE;
    }
}
