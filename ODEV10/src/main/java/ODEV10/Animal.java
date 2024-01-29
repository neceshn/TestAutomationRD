package ODEV10;
import java.util.List;

public class Animal<T> {
    private List<T> animalName;

    public Animal(List<T> animalName) {
        this.animalName = animalName;
    }

    public List<T> getName() {
        return animalName;
    }

    public void returnAnimal() {
        System.out.print("Listede Bulunan Hayvanlar: ");
        for (T animal : animalName) {
            System.out.print(animal + " ");
        }
        System.out.println();
    }

    public T findAnimal(T targetAnimal) {
        return animalName.stream()
                .filter(animal -> animal.equals(targetAnimal))
                .findFirst()
                .orElse(null);
    }
}
