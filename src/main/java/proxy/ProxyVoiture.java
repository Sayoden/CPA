package proxy;

import lombok.RequiredArgsConstructor;

public class ProxyVoiture implements IVehicule {

    private Voiture voiture;

    private Conducteur conducteur;

    public ProxyVoiture(Conducteur conducteur) {
        this.conducteur = conducteur;
        this.voiture = new Voiture();
    }

    @Override
    public void conduit() {
        if (this.conducteur.getNbPoints() > 0) {
            voiture.conduit();
        } else {
            System.out.println("Permis non valide !");
        }
    }
}
