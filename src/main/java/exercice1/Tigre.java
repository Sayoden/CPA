package exercice1;

public class Tigre implements Animal{

    @Override
    public AnimalEnum alimentation() {
        return AnimalEnum.CARNIVORE;
    }

    @Override
    public boolean vertebre() {
        return true;
    }

    @Override
    public String criAnimal() {
        return "rugissement";
    }
}
