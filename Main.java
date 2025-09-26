// Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User(1, "Raju");

        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("OOP in Java", "Bjarne Stroustrup"));

        library.showBooks();

        library.issueBook("Java Basics", user1);
        library.showBooks();

        library.returnBook("Java Basics", user1);
        library.showBooks();
    }
}
