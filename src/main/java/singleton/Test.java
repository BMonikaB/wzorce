package singleton;

public class Test {

    public static void main(String[] args) {

        Gra gra = Gra.getInstance();
        Gra.play();

        int punkty = Gra.getLicbzaPunktow();

        Gra gra1 = Gra.getInstance();

        if(gra == gra1){
            System.out.println("Jest singleton");
        }
        if (punkty == gra1.getLicbzaPunktow()){
            System.out.println("punkty te same");
        }




    }


}
