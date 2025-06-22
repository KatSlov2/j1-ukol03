package cz.czechitas.ukol3;

public class Pocitac {
    private Boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
//--------------------------------------------------------------------------
    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public String toString() {return "Centralni procesorova jednotka: " + cpu; }
//---------------------------------------------------------------------------
    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

//    public String toString() {return "Velikost operačni pameti RAM: " + ram; }
//----------------------------------------------------------------------------
    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

//    public String toString() {return "Pevny disk: " + pevnyDisk; }
//-----------------------------------------------------------------------------
    public boolean jeZapnuty (){
        return jeZapnuty;
    }

    public void zapniSe () {
       if (cpu != null) {
        System.err.println("Error: chybi cpu!");
        return;
    }
    if (ram != null) {
        System.err.println("Error: chybi ram!");
        return;
    }
    if (pevnyDisk != null) {
        System.err.println("Error: chybi pevny disk!");
        return;
    }
    if (jeZapnuty.equals(true)) {
            System.err.println("Error!Pocitac je jiz zapnuty");
        } else {
            System.out.println("Pocitac se zapnul!");
            jeZapnuty = true;
        }
    }

    public void vypniSe(){
        if (jeZapnuty.equals(false)){
            System.out.println("Pocitac se vypnul!");
        }
//        while (vypniSe()!= ; {return;}
    }

    public void vytvorSouborOVelikosti (long velikost){
        if ((setvyuziteMisto + velikost) > vyuziteMisto){
            System.err.println("Nevejde se!");
            return;
        } else {
            new vyuziteMisto = vyuziteMisto + velikost;
        }
    }
    public void vymazSouboryOVelikosti (long velikost) {
        if ((setvyuziteMisto - velikost) > 0){
            System.err.println("Error! není co mazat");
            return;
        } else {
            new vyuziteMisto = vyuziteMisto - velikosti;
        }
    }
}
