package td5;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Quotidien implements ISujet {

    @Getter
    private int numero;

    @Getter
    private String titreUne;

    @Getter
    private String[] contenuUne;

    private List<IObservateur> listeObservateurs;

    public Quotidien(int numero, String titreUne, String[] contenuUne) {
        this.numero = numero;
        this.titreUne = titreUne;
        this.contenuUne = contenuUne;
        this.listeObservateurs = new ArrayList<>();
    }

    @Override
    public void ajouterObservateur(IObservateur observateur) {
        this.listeObservateurs.add(observateur);
    }

    @Override
    public void supprimerObservateur(IObservateur observateur) {
        this.listeObservateurs.remove(observateur);
    }

    @Override
    public void notifierObservateurs() {
        for (IObservateur observateur : this.listeObservateurs) {
            observateur.actualiser(this);
        }
    }
}
