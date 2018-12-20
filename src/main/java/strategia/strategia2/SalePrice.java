package strategia.strategia2;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {

        if(isSignedUpForNewsletter==true){
            System.out.println("Cena po przecenie wynosi : " + price/2);
        }
        else System.out.println("Cena nie jest przeceniona");

    }
}
