package ODEV10_1;

import java.util.List;

public class BookSearch {
    public static <T> T findElementInCollection(List<T> collection, T targetElement) {
        return collection.stream()
                .filter(element -> element.equals(targetElement))
                .findFirst()
                .orElse(null);
    }

}