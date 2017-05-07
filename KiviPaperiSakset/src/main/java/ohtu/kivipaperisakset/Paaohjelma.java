package ohtu.kivipaperisakset;

import java.util.HashMap;
import java.util.Scanner;
import ohtu.kivipaperisakset.komennot.*;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        HashMap<String, Komento> komennot = new HashMap();
        komennot.put("a", new pelaajaaVastaan());
        komennot.put("b", new tekoalyaVastaan());
        komennot.put("c", new parempaaTekoalyaVastaan());

        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            if(komennot.containsKey(vastaus)){
                komennot.get(vastaus).suoritaKomento();
            }else{
                break;
            }
        }
    }
}
