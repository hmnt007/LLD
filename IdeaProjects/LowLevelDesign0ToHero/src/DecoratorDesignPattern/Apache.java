package DecoratorDesignPattern;

public class Apache extends TvsBike {
    private static final int BASE_PRICE = 160000;

    @Override
    int cost() {
        System.out.println("Base Cost of your bike is  " + BASE_PRICE);
        return BASE_PRICE;
    }
}
