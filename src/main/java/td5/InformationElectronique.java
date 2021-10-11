package td5;

import java.util.Arrays;

public class InformationElectronique implements IObservateur{

    @Override
    public void actualiser(ISujet sujet) {
        if (sujet instanceof Quotidien quotidien) {
            System.out.println("Voici les informations du quotidien:\nNuméro: " + quotidien.getNumero() + "\nTitre: " + quotidien.getTitreUne() + "\nContenu: " + Arrays.toString(quotidien.getContenuUne()) + "\n");
        }
    }

}
