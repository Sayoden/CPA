package exercice1;

import lombok.Getter;

import java.util.ArrayList;

public class Zoo {

    private static final int MAX_ANIMALS = 100;

    @Getter
    private String name;

    private ArrayList<Animal> animals;

    public Zoo(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) throws TableauComplet{
        if (this.animals.size() + 1 <= MAX_ANIMALS) {
            this.animals.add(animal);
        } else {
            throw new TableauComplet();
        }
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }

    public void printAnimalsInformations() {
        for (Animal animal : this.animals) {
            animal.afficher();
        }
    }

    public int getAmountAnimalType(String animal) {
        int amount = 0;
        for (Animal animal1 : this.animals) {
            if (animal.getClass().getName().equalsIgnoreCase(animal)) {
                amount++;
            }
        }
        return amount;
    }
}
