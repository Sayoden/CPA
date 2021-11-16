package td6.exercice1.decorateurs;

import td6.exercice1.DecorateurGauffre;
import td6.exercice1.Gauffre;

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