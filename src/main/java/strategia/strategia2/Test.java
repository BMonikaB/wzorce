package strategia.strategia2;

public class Test {


    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100,false);


        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, true);


        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);
    }
}
