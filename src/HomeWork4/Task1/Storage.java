package HomeWork4.Task1;

import java.util.Arrays;

public class Storage {
    private int storageSize;
    Book[] books = new Book[19];

    public Storage(int storageSize) {
        setStorageSize(storageSize);
    }

    public void setStorageSize(int storageSize) {
        if (storageSize > 20) {
            throw new IllegalArgumentException("Storage supports only 20 books");
        } else {
            this.storageSize = storageSize;
        }
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }

        }
    }

    @Override
    public String toString() {
        return "Storage {" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}