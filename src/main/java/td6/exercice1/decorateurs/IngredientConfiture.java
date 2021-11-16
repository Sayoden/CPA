package td6.decorateurs;

import td6.DecorateurGauffre;
import td6.Gauffre;

public class IngredientConfiture extends DecorateurGauffre {

    public IngredientConfiture(Gauffre gauffre) {
        this.gauffre = gauffre;
    }

    @Override
    public String getLibelle() {
        return gauffre.getLibelle() + " avec de la confiture";
    }

    @Override
    public double getPrix() {
        return gauffre.getPrix() + 1.25;
    }
}