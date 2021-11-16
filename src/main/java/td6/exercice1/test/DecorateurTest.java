package td6.exercice1.test;

import td6.exercice1.Gauffre;
import td6.exercice1.GauffreBruxelloise;
import td6.exercice1.decorateurs.IngreditChocolat;
import td6.exercice1.decorateurs.SupplementChantilly;

public class DecorateurTest {

    public static void main(String[] args) {
        Gauffre gauffre1 = new IngreditChocolat(
                new SupplementChantilly(new GauffreBruxelloise())
        );

        System.out.println(gauffre1);
    }
}
