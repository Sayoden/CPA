package td6.nouveau_sujet.decorateurs;

import lombok.RequiredArgsConstructor;
import td6.nouveau_sujet.DecorateurBonbon;
import td6.nouveau_sujet.IContenant;

@RequiredArgsConstructor
public class RechargeSucette extends DecorateurBonbon {

    private final IContenant contenant;

    @Override
    public String getLibelle() {
        return "avec une recharge sucettes.\n";
    }

    @Override
    public double getPrix() {
        return this.contenant.getPrix() + 2;
    }
}
