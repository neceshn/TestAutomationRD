package ODEV10_1;

public class Book<T> {
    private T name;

    public Book(T name) {
        this.name = name;
    }

    public void printGenericBook() {
        System.out.println("Generic Alan: " + name);
    }


}
