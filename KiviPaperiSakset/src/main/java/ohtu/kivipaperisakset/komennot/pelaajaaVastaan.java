/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset.komennot;

import ohtu.kivipaperisakset.KPSPelaajaVsPelaaja;

/**
 *
 * @author pullis
 */
public class pelaajaaVastaan extends Komento {

    @Override
    public void suoritaKomento() {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        KPSPelaajaVsPelaaja kaksinpeli = new KPSPelaajaVsPelaaja();
        kaksinpeli.pelaa();
    }
    
}
