import hu.petrik.festmenyekOOP.Festmenyek;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Festmenyek f1 = new Festmenyek("Sikoly", "Pablo Picasso","barokk");
        f1.licit(150);
        System.out.println(f1);

    }
}