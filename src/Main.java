import hu.petrik.festmenyekOOP.Festmeny;
import hu.petrik.festmenyekOOP.Festmenyek;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Festmenyek> festmeny;
        public static void main(String[] args) {
            Festmenyek f1 = new Festmenyek("Sikoly", "Pablo Picasso","barokk");
            Festmeny festmenyek = new Festmeny(new Festmenyek[]{f1});
            Scanner sc = new Scanner(System.in);


            System.out.println("Mennyi festmeny adatait szeretne hozzaadni?\n");
            int db = sc.nextInt();
            Festmenyek[] fTomb = new Festmenyek[db];
            for (int i = 0; i < db; i++) {

                System.out.println("Kérem adja meg a festmeny cimet: \n");
                String cim2 = sc.next();
                System.out.println("Kérem adja meg a festmeny festojet: \n");
                String festo2 = sc.next();
                System.out.println("Kérem adja meg a festmeny stilusat: \n");
                String stilus2 = sc.next();
                Festmenyek ujFestmeny = new Festmenyek(cim2, festo2, stilus2);
                fTomb[i] = ujFestmeny;
            }
            try {
                Festmeny festmeny2 = new Festmeny("festmenyek.txt");
                System.out.println(festmeny2);
            }catch (FileNotFoundException e)
            {
                System.out.println("Hiba nem található txt fájl");
            }
            catch (IOException e)
            {
                System.err.println("hiba");
            }



        }
}