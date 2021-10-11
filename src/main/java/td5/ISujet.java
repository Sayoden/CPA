package td5;

public interface ISujet {

    void ajouterObservateur(IObservateur observateur);

    void supprimerObservateur(IObservateur observateur);

    void notifierObservateurs();
}
