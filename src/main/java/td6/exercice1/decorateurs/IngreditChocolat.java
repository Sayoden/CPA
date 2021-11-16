package td6.decorateurs;

import td6.DecorateurGauffre;
import td6.Gauffre;

public class IngreditChocolat extends DecorateurGauffre {

    public IngreditChocolat(Gauffre gauffre) {
        this.gauffre = gauffre;
    }

    @Override
    public String getLibelle() {
        return gauffre.getLibelle() + " avec du chocolat";
    }

    @Override
    public double getPrix() {
        return gauffre.getPrix() + 1.5;
    }
}