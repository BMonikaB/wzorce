package builder;

public class Test {
    public static void main(String[] args) throws Exception {
        FlightLeg flightLeg = new FlightLeg.FlightLegBuilder("Polska","Hiszpania").delayed(true).price(1).flightLeg();
        System.out.println(flightLeg);
    }
}
