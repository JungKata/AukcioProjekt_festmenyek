package hu.petrik.festmenyekOOP;

import java.time.LocalDate;

public class Festmenyek {
private String cim;
private String festo;
private String stilus;
private int licitekSzama;
private int legmagasabbLicit;
private LocalDate legutolsoLicitIdeje;
private boolean elkelt;

    public Festmenyek(String cim, String festo, String stilus, int licitekSzama, int legmagasabbLicit, LocalDate legutolsoLicitIdeje, boolean elkelt) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;

    }


}
