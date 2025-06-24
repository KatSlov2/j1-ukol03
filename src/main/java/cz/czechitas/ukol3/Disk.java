package cz.czechitas.ukol3;

public class Disk {
    private Long kapacita;
    private Long vyuziteMisto;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        this.kapacita = kapacita;
    }

    public String toString() { return "kapacita disku" + kapacita + " GB"; }

    public Long getVyuziteMisto() {
        return vyuziteMisto;

    }

    public void setVyuziteMisto(Long vyuziteMisto) {
        if(vyuziteMisto > kapacita) {
            System.err.println("Nevejde se!");
            return;
        }
        if(vyuziteMisto < 0) {
            System.err.println("Není místo!");
            return;
        }
        this.vyuziteMisto = vyuziteMisto;
    }

}
