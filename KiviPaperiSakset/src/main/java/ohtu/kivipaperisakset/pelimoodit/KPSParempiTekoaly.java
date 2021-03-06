package ohtu.kivipaperisakset.pelimoodit;

import java.util.Scanner;

import java.util.Scanner;
import ohtu.kivipaperisakset.TekoalyParannettu;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPS {

    private TekoalyParannettu tekoaly;
    
    public KPSParempiTekoaly(){
        tekoaly = new TekoalyParannettu(20);
    }

    @Override
    void suoritaToisenPelaajanSiirto() {
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
    }
}
