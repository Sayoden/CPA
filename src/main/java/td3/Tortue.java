package td3;

public class Tortue extends Animal{

    protected Tortue(IStrategieDeplacement deplacement, IStrategieCombat combat) {
        super(new DeplacementMarche(), new CombatRouler());
    }
}
