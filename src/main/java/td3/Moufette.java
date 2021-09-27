package td3;

public class Moufette extends Animal {
    @Override
    public String strategieDeplacement() {
        return new DeplacementTrot().deplacement();
    }

    @Override
    public String strategieCombat() {
        return new CombatLancer().combat();
    }
}
