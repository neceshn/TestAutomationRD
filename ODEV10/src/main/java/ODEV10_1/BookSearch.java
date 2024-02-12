package ODEV10_1;

import java.util.List;

public class BookSearch {
    public static <T> Integer findElementInCollection(List<T> collection, T targetElement) {
        return collection.stream()
                .filter(element -> element.equals(targetElement))
                .findFirst()
                .map(collection::indexOf)
                .orElse(-1);
    }

}