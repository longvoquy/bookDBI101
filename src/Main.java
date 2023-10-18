import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "E:\\ki_3\\CSD101\\Book\\src\\bookdata\\books3.csv"; // Đặt đường dẫn đến tệp CSV của bạn ở đây


        // Sử dụng ReadCSV để đọc dữ liệu từ tệp CSV
        ReadCSV csvReader = new ReadCSV(filePath);
        try {
            List<Books> booksList = csvReader.readFile();

            // Sắp xếp danh sách theo tiêu đề
            // Sắp xếp danh sách theo tên tác giả bằng cách sử dụng Insertion Sort
            InsertionSort.sort(booksList, new Comparators.YearPublishedComparator());


            // In ra 5 tên sách đã sắp xếp
            System.out.println("5 tên sách đã được sắp xếp theo năm xuất bản:");
            int limit = Math.min(5, booksList.size());
            for (int i = 0; i < limit; i++) {
                System.out.println(booksList.get(i).getTitle());
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp CSV: " + e.getMessage());
        }
    }

}




