package td6.decorateurs;

import td6.DecorateurGauffre;
import td6.Gauffre;

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