import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books){
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book.title);
        }
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (title.equalsIgnoreCase(book.title)) {
                return book;
            }
        }
        return null;
    }

    public int countBookByAuthor(String author) {
        int count = 0;
        for (Book book : books) {
            if (author.equalsIgnoreCase(book.author)) {
                count++;
            }
        }
        return count;
    }
}
