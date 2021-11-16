package td6.decorateurs;

import td6.DecorateurGauffre;
import td6.Gauffre;

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
