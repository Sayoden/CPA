package td3;

import lombok.Getter;
import lombok.Setter;

public abstract class Animal {

    @Getter
    @Setter
    private IStrategieCombat iStrategieCombat;

    @Getter
    @Setter
    private IStrategieDeplacement iStrategieDeplacement;

    protected Animal (IStrategieDeplacement deplacement, IStrategieCombat combat) {
        this.iStrategieCombat = combat;
        this.iStrategieDeplacement = deplacement;
    }

    public String strategieDeplacement() {
        return this.iStrategieDeplacement.deplacement();
    }

    public String strategieCombat() {
        return this.iStrategieCombat.combat();
    }

}
