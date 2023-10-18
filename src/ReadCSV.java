

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

    private String filePath;

    public ReadCSV(String filePath) {
        this.filePath = filePath;
    }

    public List<Books> readFile() throws IOException {
        // Open the CSV file
        File csvFile = new File(filePath);

        // Create a buffered reader to read the file line by line
        BufferedReader reader = new BufferedReader(new FileReader(csvFile));

        // Skip the first line, which contains the headers
        reader.readLine();

        // Initialize a list of Books objects
        List<Books> books = new ArrayList<>();

        // Read each line of the file
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line into fields
            String[] fields = line.split(";");

            // Ensure that the yearPublished is a valid integer
            String yearPublishedStr = fields[3].replaceAll("\"", "");
            int yearPublished = 0; // Default value if parsing fails
            try {
                yearPublished = Integer.parseInt(yearPublishedStr);
            } catch (NumberFormatException e) {
                // Handle the case where parsing fails
                System.err.println("Error parsing yearPublished: " + yearPublishedStr);
            }

            // Create a new Books object
            Books book = new Books(
                    fields[0].replaceAll("\"", ""), // ISBN
                    fields[1].replaceAll("\"", ""), // Title
                    fields[2].replaceAll("\"", ""), // Author
                    yearPublished, // Year Published
                    fields[4].replaceAll("\"", ""), // Publisher
                    fields[5].replaceAll("\"", ""), // ImageUrls
                    fields[6].replaceAll("\"", ""), // ImageUrls1
                    fields[7].replaceAll("\"", "") // ImageUrls2
            );

            // Add the Books object to the list
            books.add(book);
        }

        return books;
    }
}
