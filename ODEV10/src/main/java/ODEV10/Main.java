package ODEV10;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(List.of("Köpek","Kedi","Keçi"));
        Animal<String> listAnimal = new Animal<>(animals);
        listAnimal.returnAnimal();

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));
        Animal<Integer> integerAnimal = new Animal<>(integerList);
        integerAnimal.returnAnimal();

        String targetAnimal = "Keçi";
        String result = listAnimal.findAnimal(targetAnimal);

        if (result != null) {
            System.out.println(targetAnimal + " bulundu");
        } else {
            System.out.println(targetAnimal + " bulunamadı");
        }
    }


}