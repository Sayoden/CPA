package td5;

public class ObservateurTest {

    public static void main(String[] args) {
        Quotidien quotidien = new Quotidien(1, "BOnjour", new String[]{"rvce", "bvruji", "vybun", "huhuaau"});

        quotidien.ajouterObservateur(new InformationPapier());
        quotidien.ajouterObservateur(new InformationElectronique());
        quotidien.ajouterObservateur(new InformationNotifications());

        quotidien.notifierObservateurs();
    }
}
