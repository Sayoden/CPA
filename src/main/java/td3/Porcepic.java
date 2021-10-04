package td3;

public class Porcepic extends Animal{

    protected Porcepic(IStrategieDeplacement deplacement, IStrategieCombat combat) {
        super(new DeplacementMarche(), new CombatLancer());
    }
}
