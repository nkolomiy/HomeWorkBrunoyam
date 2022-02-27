package HomeWork4Task1;

import java.util.Arrays;
import java.util.Calendar;

public class Book {
    private String bookName;
    private int pageCount;
    private int publicationYear;
    private Author[] authors;
    int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public Book(String bookName, int pageCount, int publicationYear, Author[] authors) {
        setBookName(bookName);
        setPageCount(pageCount);
        setPublicationYear(publicationYear);
        setAuthors(authors);
    }

    public void setBookName(String bookName) {
        if (bookName.isEmpty()) {
            throw new IllegalArgumentException("Please enter a book name");
        } else {
            this.bookName = bookName;
        }
    }

    public void setPageCount(int pageCount) {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Count of pages cannot be 0 or less");
        } else {
            this.pageCount = pageCount;
        }
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear > currentYear) {
            throw new IllegalArgumentException("Year is too young");
        } else {
            this.publicationYear = publicationYear;
        }
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book {" +
                "book name='" + bookName + '\'' +
                ", pages=" + pageCount +
                ", publication year=" + publicationYear +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
