package adapter.adapter1;

import adapter.adapter1.SprzetEuropa;
import adapter.adapter1.SprzetUSA;

public class UsaEuropaAdapter implements SprzetEuropa {



    SprzetUSA sprzetUSA;

    public UsaEuropaAdapter(SprzetUSA sprzetUSA) {
        this.sprzetUSA = sprzetUSA;
    }

    @Override
    public void wlacz() {
        sprzetUSA.wlacz1();
    }
}
