package strategia.strategia2;

public class RegularPrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {

        if(isSignedUpForNewsletter==false) {
            System.out.println("Cena regularna : " + price);
        }
        else System.out.println("Cena jest przeceniona");
    }
}
