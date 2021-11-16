package td6.decorateurs;

import td6.DecorateurGauffre;
import td6.Gauffre;

public class IngredientCassonade extends DecorateurGauffre {

    public IngredientCassonade(Gauffre gauffre) {
        this.gauffre = gauffre;
    }

    @Override
    public String getLibelle() {
        return gauffre.getLibelle() + " avec de la cassonade";
    }

    @Override
    public double getPrix() {
        return gauffre.getPrix() + 0.75;
    }
}