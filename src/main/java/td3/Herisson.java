package td3;

public class Herisson extends Animal{

    protected Herisson(IStrategieDeplacement deplacement, IStrategieCombat combat) {
        super(new DeplacementMarche(), new CombatLancer());
    }

}
