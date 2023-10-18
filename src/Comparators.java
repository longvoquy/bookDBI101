

import java.util.Comparator;


public class Comparators {

    public static class TitleComparator implements Comparator<Books> {

        @Override
        public int compare(Books book1, Books book2) {
            return book1.getTitle().compareToIgnoreCase(book2.getTitle());
        }
    }

    public static class AuthorComparator implements Comparator<Books> {

        @Override
        public int compare(Books book1, Books book2) {
            return book1.getAuthor().compareToIgnoreCase(book2.getAuthor());
        }
    }


    public static class YearPublishedComparator implements Comparator<Books> {

        @Override
        public int compare(Books book1, Books book2) {
            return book1.getYearPublished() - book2.getYearPublished();
        }
    }
}

