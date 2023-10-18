
import java.util.Comparator;


import java.util.List;

public class InsertionSort {
    public static void sort(List<Books> booksList, Comparator<Books> comparator) {
        int n = booksList.size();
        for (int i = 1; i < n; i++) {
            Books key = booksList.get(i);
            int j = i - 1;

            while (j >= 0 && comparator.compare(booksList.get(j), key) > 0) {
                booksList.set(j + 1, booksList.get(j));
                j = j - 1;
            }
            booksList.set(j + 1, key);
        }
    }
}

