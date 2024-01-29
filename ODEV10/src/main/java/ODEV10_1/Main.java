package ODEV10_1;

import java.util.List;

import static ODEV10_1.BookSearch.findElementInCollection;

public class Main {
    public static void main(String[] args) {

        Book<String> stringBook = new Book<>("Ders");
        stringBook.printGenericBook();

        Book<Integer> intBook = new Book<>(42);
        intBook.printGenericBook();

        List<String> stringList = List.of("Java", "Python", "C++", "JavaScript");
        String targetString = "C++";
        String foundString = findElementInCollection(stringList, targetString);

        if (foundString != null) {
            System.out.println("Kitap bulundu: " + foundString);
        } else {
            System.out.println("Kitap bulunamadı.");
        }
    }
}