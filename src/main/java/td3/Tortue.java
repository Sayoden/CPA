package td3;

public class Tortue extends Animal{
    @Override
    public String strategieDeplacement() {
        return new DeplacementMarche().deplacement();
    }

    @Override
    public String strategieCombat() {
        return new CombatRouler().combat();
    }
}
