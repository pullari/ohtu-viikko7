package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPS {

    private Tekoaly tekoaly;
    
    public KPSTekoaly(){
        tekoaly = new Tekoaly();
    }

    @Override
    void suoritaToisenPelaajanSiirto() {
        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
    }
}