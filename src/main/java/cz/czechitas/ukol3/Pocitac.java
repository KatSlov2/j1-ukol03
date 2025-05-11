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
    public void jeZapnuty (){
        jeZapnuty = true;
    }

    public void zapniSe () {
    if (jeZapnuty.equals(true)) {
        System.err.println("Error!Pocitac je jiz zapnuty");
    } else {
        System.out.println("Pocitac se zapnul!");
    }
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
    }

    public void vypniSe(){
        if (jeZapnuty.equals(false)){
            System.out.println("Pocitac se vypnul!");
        }
//        while (vypniSe()!= ; {return;}
    }

    public void vytvorSouborOVelikosti (long velikosti){
        if ((setvyuziteMisto + velikosti) > vyuziteMisto){
            System.err.println("Nevejde se!");
            return;
        } else {
            new vyuziteMisto = vyuziteMisto + velikosti;
        }

    }
}
