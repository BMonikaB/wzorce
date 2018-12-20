package adapter.adapter1;

public class Test {
    public static void main(String[] args) {


        SprzetEuropa tv = new SprzetEuropa() {
            @Override
            public void wlacz() {
                System.out.println("Radio Polskie");
            }
        };

        SprzetUSA tv2 = new SprzetUSA() {
            @Override
            public void wlacz1() {
                System.out.println("Radio USA");
            }
        };

        GniazdkoEuropa gniazdkoEuropa = new GniazdkoEuropa();
        GdniazdkoUSA gdniazdkoUSA = new GdniazdkoUSA();

        gniazdkoEuropa.podlacz(tv);
        gdniazdkoUSA.podlacz(tv2);

        UsaEuropaAdapter usaEuropaAdapter = new UsaEuropaAdapter(tv2);
        gniazdkoEuropa.podlacz(usaEuropaAdapter);


    }
}