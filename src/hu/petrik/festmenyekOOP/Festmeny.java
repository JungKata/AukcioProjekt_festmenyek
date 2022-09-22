package hu.petrik.festmenyekOOP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Festmeny {

    private List<Festmenyek> festmenyek;

    public Festmeny(Festmenyek[] festmenyekTomb)
    {
        this.festmenyek = new ArrayList<>();
        this.festmenyek.addAll(Arrays.asList(festmenyekTomb));
    }

    public Festmeny(String fajlnev) throws IOException
    {
        this.festmenyek = new ArrayList<>();
        FileReader fr = new FileReader(fajlnev);
        BufferedReader br = new BufferedReader(fr);
        String sor = br.readLine();
        while (sor != null && !sor.equals(""))
        {
            String[] adatok = sor.split(";");
            Festmenyek festmeny = new Festmenyek(adatok[0], adatok[1], adatok[2]);
            this.festmenyek.add(festmeny);
            sor = br.readLine();
        }
        br.close();
        fr.close();
    }

    @Override
    public  String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(Festmenyek e: this.festmenyek)
        {
            sb.append(e.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
