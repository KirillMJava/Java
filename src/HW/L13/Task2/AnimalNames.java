package HW.L13.Task2;

import java.util.LinkedHashSet;
import java.util.Set;

public class AnimalNames {

    Set<String> animalNames = new LinkedHashSet<>();
    {
    animalNames.add("Girafe");
    animalNames.add("Panda");
    animalNames.add("Elephant");
    animalNames.add("Crocodile");
    animalNames.add("Lion");
    animalNames.add("Tiger");
    }

    public AnimalNames() {
    }

    public Set<String> getAnimalNames() {
        return animalNames;
    }


    @Override
    public String toString() {
        return "AnimalNames:" + animalNames ;

    }

}
