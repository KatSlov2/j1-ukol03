package cz.czechitas.ukol3;

import cz.czechitas.ukol3.Pocitac;
import cz.czechitas.ukol3.Disk;
import cz.czechitas.ukol3.Pamet;
import cz.czechitas.ukol3.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        Pocitac mujPocitac = new Pocitac ();
        System.out.println(mujPocitac.toString());
        mujPocitac.zapniSe();

        Procesor mujProcesor = new Procesor ();
        mujProcesor.setRychlost(4_90_000_000L);
        mujProcesor.setVyrobce("Acer");

        Pamet mujPamet = new Pamet ();
        mujPamet.setKapacita(1_000_000_000_000L);

        Disk mujDisk = new Disk ();
        mujDisk.setKapacita(1_000_000_000_000L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mujPamet);
        mujPocitac.setPevnyDisk(mujDisk);

        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();

        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe();

        mujPocitac.zapniSe();



//        System.out.println("Program spuštěn.");

    }

}
