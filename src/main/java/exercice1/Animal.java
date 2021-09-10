package exercice1;

public interface Animal {

    enum AnimalEnum {
        CARNIVORE,
        HERBIVORE,
        OMNIVORE
    }

    AnimalEnum alimentation();

    boolean vertebre();

    String criAnimal();

    default void afficher() {
        System.out.println("L'animal est "
                + alimentation().name()
                + ". Il est "
                + (vertebre() ? "vertebré" : "non vertebré")
                + " et son cri est le: "
                + criAnimal());
    }
}
