package HomeWork4;

public class Main {
    public static void main(String[] args) {

        Storage library = new Storage(20);
        Author author1 = new Author("Lev", "Tolstoy");
        Book book1 = new Book("War and Peace", 5000, 1850, new Author[]{author1});
        library.addBook(book1);

        Author author2 = new Author("Alexander", "Pushkin");
        Book book2 = new Book("Stikhi", 100, 1830, new Author[]{author2});
        library.addBook(book2);

        System.out.println(library);
    }
}
