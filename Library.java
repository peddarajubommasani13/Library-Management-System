// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public void issueBook(String title, User user) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                b.issueBook();
                System.out.println(user.getName() + " issued " + title);
                return;
            }
        }
        System.out.println("Book not available!");
    }

    public void returnBook(String title, User user) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println(user.getName() + " returned " + title);
                return;
            }
        }
        System.out.println("Invalid return attempt!");
    }
}
