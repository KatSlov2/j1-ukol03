package cz.czechitas.ukol3;

public class Pocitac {
    private Boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    //--------------------------------------------------------------------------
    public cz.czechitas.ukol3.Procesor getCpu() {
        return cpu;
    }

    public void setCpu(cz.czechitas.ukol3.Procesor cpu) {
        this.cpu = cpu;
    }

    public String toString() {return "Centralni procesorova jednotka: " + cpu; }
    //---------------------------------------------------------------------------
    public cz.czechitas.ukol3.Pamet getRam() {
        return ram;
    }

    public void setRam(cz.czechitas.ukol3.Pamet ram) {
        this.ram = ram;
    }

    //    public String toString() {return "Velikost operačni pameti RAM: " + ram; }
//----------------------------------------------------------------------------
    public cz.czechitas.ukol3.Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(cz.czechitas.ukol3.Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    //    public String toString() {return "Pevny disk: " + pevnyDisk; }
//-----------------------------------------------------------------------------
    public boolean jeZapnuty(){
        return jeZapnuty;
    }

    public void zapniSe() {
        if(cpu != null) {
            System.err.println("Error: chybi cpu!");
            return;
        }
        if(ram != null) {
            System.err.println("Error: chybi ram!");
            return;
        }
        if(pevnyDisk != null) {
            System.err.println("Error: chybi pevny disk!");
            return;
        }
        if(jeZapnuty.equals(true)) {
            System.err.println("Error!Pocitac je jiz zapnuty");
        } else {
            System.out.println("Pocitac se zapnul!");
            jeZapnuty = true;
        }
    }

    public void vypniSe(){
        if(jeZapnuty.equals(false)){
            System.out.println("Pocitac se vypnul!");
        }
        return;
    }
}

public void vytvorSouborOVelikosti(long velikost){
   PevnyDisk soubor = new PevnyDisk ();
   soubor = vyuziteMisto + velikost;
   return vytvorSouborOVelikosti();

}
public void vymazSouboryOVelikosti(long velikost) {

    return vymazSouboryOVelikosti();

}

