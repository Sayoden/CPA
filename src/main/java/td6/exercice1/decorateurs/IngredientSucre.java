package td6.exercice1.decorateurs;

import td6.exercice1.DecorateurGauffre;
import td6.exercice1.Gauffre;

public class IngredientSucre extends DecorateurGauffre {

    public IngredientSucre(Gauffre gauffre) {
        this.gauffre = gauffre;
    }

    @Override
    public String getLibelle() {
        return gauffre.getLibelle() + " avec du sucre";
    }

    @Override
    public double getPrix() {
        return gauffre.getPrix() + 0.5;
    }
}
