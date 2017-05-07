/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset.pelimoodit;

import java.util.Scanner;
import ohtu.kivipaperisakset.Tuomari;

/**
 *
 * @author pullis
 */
public abstract class KPS {
    
    protected static final Scanner scanner = new Scanner(System.in);
    protected String ekanSiirto;
    protected String tokanSiirto;

    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        
        suoritaToisenPelaajanSiirto();
        
        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();
            
            suoritaToisenPelaajanSiirto();
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
    
    abstract void suoritaToisenPelaajanSiirto();
}
