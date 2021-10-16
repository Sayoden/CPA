package td5;

public class InformationPapier implements IObservateur{

    @Override
    public void actualiser(ISujet sujet) {
        if (sujet instanceof Quotidien) {
            System.out.println("Vous pouvez aller chercher votre exemplaire dans votre boîte aux lettres\n");
        }
    }

}

