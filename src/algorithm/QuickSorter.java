package algorithm;

import data.Books;

import java.util.Comparator;
import java.util.List;

public class QuickSorter {
    public static void sort(List<Books> list, Comparator<Books> comparator) {
        quickSort(list, comparator, 0, list.size() - 1);
    }

    private static void quickSort(List<Books> list, Comparator<Books> comparator, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, comparator, low, high);
            quickSort(list, comparator, low, pivotIndex - 1);
            quickSort(list, comparator, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Books> list, Comparator<Books> comparator, int low, int high) {
        Books pivot = list.get(low);  // Chọn pivot ở vị trí đầu tiên
        int i = low;

        for (int j = low + 1; j <= high; j++) {
            if (comparator.compare(list.get(j), pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i, low);  // Hoán đổi pivot về đúng vị trí cuối cùng của các phần tử nhỏ hơn pivot
        return i;
    }


    private static void swap(List<Books> list, int i, int j) {
        Books temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}

