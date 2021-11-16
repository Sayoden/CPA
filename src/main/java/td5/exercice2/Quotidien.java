package td5.exercice2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Quotidien extends Observable{

    private int numero;

    private String titre;

    private String[] contenu;

    @Override
    void addListener(PropertyChangeListener listener) {
        this.getSupport().addPropertyChangeListener(listener);
    }

    @Override
    void removeListener(PropertyChangeListener listener) {
        this.getSupport().removePropertyChangeListener(listener);
    }

    @Override
    void updateListener(PropertyChangeListener listener) {

    }

    public void setNumero(int numero) {
        int oldNumero = this.numero;
        this.numero = numero;

        this.getSupport().firePropertyChange("numero", oldNumero, numero);
    }

    public void setTitre(String titre) {
        String oldTitre = this.titre;
        this.titre = titre;

        this.getSupport().firePropertyChange("titre", oldTitre, titre);

    }

    public void setContenu(String[] contenu) {
        String[] oldContenu = this.contenu;
        this.contenu = contenu;

        this.getSupport().firePropertyChange("contenu", oldContenu, contenu);

    }
}
