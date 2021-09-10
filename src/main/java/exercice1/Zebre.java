package exercice1;

public class Zebre implements Animal{

    @Override
    public AnimalEnum alimentation() {
        return AnimalEnum.HERBIVORE;
    }

    @Override
    public boolean vertebre() {
        return true;
    }

    @Override
    public String criAnimal() {
        return "hennissement";
    }
}
