package td6.nouveau_sujet;

import td6.exercice1.Gauffre;

public abstract class DecorateurBonbon implements IContenant {

    protected IContenant bonbon;

    public abstract String getLibelle();

    public abstract double getPrix();
}
