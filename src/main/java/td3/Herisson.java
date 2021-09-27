package td3;

public class Herisson extends Animal{
    @Override
    public String strategieDeplacement() {
        return new DeplacementMarche().deplacement();
    }

    @Override
    public String strategieCombat() {
        return new CombatLancer().combat();
    }
}
