package td6.exercice1.decorateurs;

import td6.exercice1.DecorateurGauffre;
import td6.exercice1.Gauffre;

public class SupplementChantilly extends DecorateurGauffre {

    public SupplementChantilly(Gauffre gauffre) {
        this.gauffre = gauffre;
    }

    @Override
    public String getLibelle() {
        return gauffre.getLibelle() + " avec de la chantilly";
    }

    @Override
    public double getPrix() {
        return gauffre.getPrix() + 1;
    }
}