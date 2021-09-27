package td3;

public class Ecureuil extends Animal {
    @Override
    public String strategieDeplacement() {
        return new DeplacementArbre().deplacement();
    }

    @Override
    public String strategieCombat() {
        return new CombatBomb().combat();
    }
}
