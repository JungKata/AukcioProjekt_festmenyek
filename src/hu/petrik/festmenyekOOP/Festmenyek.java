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

    public Festmenyek(String cim, String festo, String stilus) {
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
        if (elkelt)
        {
            System.out.println("A festmeny már elkelt");
        }else {
            if (licitekSzama == 0 ){
                legmagasabbLicit = 100;
                this.licitekSzama = 1;
                this.legutolsoLicitIdeje = LocalDateTime.now();
            } else if (licitekSzama > 0) {
                this.legmagasabbLicit = (int) (legmagasabbLicit * 1.1);
                this.licitekSzama = licitekSzama + 1;
                legutolsoLicitIdeje = LocalDateTime.now();
            }
        }
    }

    public void licit(int vegosszeg)
    {
        if (elkelt == true)
        {
            System.out.println("Festmény elkelt");
        }else{
            if (vegosszeg < 10 || vegosszeg >100)
            {
                System.out.println("Nem megfelelő a licit érték túl nagy vagy túl alacsony");
            }else{
                if (vegosszeg > legmagasabbLicit)
                {
                    String c = String.valueOf(vegosszeg);
                    legmagasabbLicit = vegosszeg;
                    licitekSzama++;
                    legutolsoLicitIdeje = LocalDateTime.now();
                }
            }
        }
    }

    @Override
    public String toString(){
        return String.format("Festő: %s (%s) \n %b\n Legmagasabb licit: $%d(összesen: %d )",festo, stilus, licitekSzama, legmagasabbLicit, legutolsoLicitIdeje);
        }

}
