package td3;

public class Moufette extends Animal {

    protected Moufette(IStrategieDeplacement deplacement, IStrategieCombat combat) {
        super(new DeplacementTrot(), new CombatLancer());
    }

}
