package td5;

import java.util.Arrays;

public class InformationNotifications implements IObservateur{

    @Override
    public void actualiser(ISujet sujet) {
        if (sujet instanceof Quotidien quotidien) {
            System.out.println("Numéro: " + quotidien.getNumero() + " et le tire est: " + quotidien.getTitreUne() + "\n");
        }
    }

}
