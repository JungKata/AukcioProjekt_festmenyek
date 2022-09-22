package hu.petrik.festmenyekOOP;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Festmenyek {
private String cim;
private String festo;
private String stilus;
private int licitekSzama;
private int legmagasabbLicit;
private LocalDateTime legutolsoLicitIdeje;
private boolean elkelt;

    public Festmenyek(String cim, String festo, String stilus, int licitekSzama, int legmagasabbLicit, LocalDate legutolsoLicitIdeje, boolean elkelt) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
        licitekSzama = 0;
        legmagasabbLicit = 0;

    }
    public String getFesto()
    {
    return festo;
    }

    public String getStilus()
    {
        return stilus;
    }
    public int getLicitekSzama()
    {
        return licitekSzama;
    }
    public int getLegmagasabbLicit()
    {
        return  legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje()
    {
        return legutolsoLicitIdeje;
    }

    public boolean getElkelt()
    {
        return elkelt;
    }

    public void  setElkelt(boolean elkelt)
    {
        this.elkelt = elkelt;
    }

    public void licit()
    {
        if (elkelt == true)
        {
            System.out.println("A festmeny már elkelt");
        }else {
            if (legmagasabbLicit == 0 ){
                legmagasabbLicit = 100;
                licitekSzama++;
            } else if (legmagasabbLicit > 0) {
                legmagasabbLicit *= 1.10;
                licitekSzama++;
                legutolsoLicitIdeje = LocalDateTime.now();
            }
        }
    }

    @Override
    public String toString(){
        return String.format("Festő: %s (%s) \n %b\n Legmagasabb licit: $%d(összesen: %d )",festo, stilus, licitekSzama, legmagasabbLicit, legutolsoLicitIdeje);
        }

}
