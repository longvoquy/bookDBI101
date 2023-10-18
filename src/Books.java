
import java.util.List;


public class Books {

    private String isbn;
    private String title;
    private String author;
    private int yearPublished;
    private String publisher;
    private String imageUrls;
    private String imageUrls1;
    private String imageUrls2;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public String getImageUrls1() {
        return imageUrls1;
    }

    public String getImageUrls2() {
        return imageUrls2;
    }

    public Books(String isbn, String title, String author, int yearPublished, String publisher, String imageUrls, String imageUrls1, String imageUrls2) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.imageUrls = imageUrls;
        this.imageUrls1 = imageUrls1;
        this.imageUrls2 = imageUrls2;
    }

    @Override
    public String toString() {
        return "Books{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", yearPublished=" + yearPublished + ", publisher=" + publisher + ", imageUrls=" + imageUrls + ", imageUrls1=" + imageUrls1 + ", imageUrls2=" + imageUrls2 + '}';
    }

    

    
}
