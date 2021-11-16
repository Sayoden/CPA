package td6.test;

import td6.Gauffre;
import td6.GauffreBruxelloise;
import td6.decorateurs.IngreditChocolat;
import td6.decorateurs.SupplementChantilly;

public class DecorateurTest {

    public static void main(String[] args) {
        Gauffre gauffre1 = new IngreditChocolat(
                new SupplementChantilly(new GauffreBruxelloise())
        );

        System.out.println(gauffre1);
    }
}
