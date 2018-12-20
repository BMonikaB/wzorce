package singleton;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Gra implements Serializable {

    private Gra(){};

    public static Gra instance = new Gra();

    public static Gra getInstance() {
        return instance;
    }

    public static int licbzaPunktow = 0;

    public static int getLicbzaPunktow() {
        return licbzaPunktow;
    }

    public static void play(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<9; i++){
            System.out.println("Podaj liczbę :");
            int liczba = scanner.nextInt();
            int liczbaRandom = random.nextInt(10);
            if(liczba==liczbaRandom){
                licbzaPunktow++;
            }
            else System.out.println("Miała być : " + liczbaRandom);
        }


       System.out.println("Suma : " +licbzaPunktow );
    }


}
