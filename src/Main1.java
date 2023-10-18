


import java.io.IOException;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\MSII\\Desktop\\CSD201_FA23\\BooksTest\\src\\books3.csv"; // Đặt đường dẫn đến tệp CSV của bạn ở đây

        // Sử dụng ReadCSV để đọc dữ liệu từ tệp CSV
        ReadCSV csvReader = new ReadCSV(filePath);
        try {
            List<Books> booksList = csvReader.readFile();

            // Sắp xếp danh sách theo tên tác giả
            QuickSorter1.sort(booksList, new Comparators.AuthorComparator());

            // In ra 5 tên sách đã sắp xếp
            System.out.println("5 tên sách đã được sắp xếp theo tên tác giả:");
            int limit = Math.min(5, booksList.size());
            for (int i = 0; i < limit; i++) {
                System.out.println(booksList.get(i).getTitle());
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp CSV: " + e.getMessage());
        }
    }
}






