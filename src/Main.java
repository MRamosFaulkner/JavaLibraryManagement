import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Jake Matthew Saga", "Josiah Akhtab", 2019, 434, "Sci-Fi", true);
        Book book2 = new Book("Yet Holding On", "Nicole Bird Faulkner", 2006, 228, "Drama", false);
        Book book3 = new Book("Twilight", "Stephanie Meyer", 2005, 498, "Romance", false);

        System.out.println("Library Management System in Java\n");

        List<Book> booksOnLoan = new ArrayList<>();
        booksOnLoan.add(book1);
        booksOnLoan.add(book3);

        //New user
        User user = new User("James Jones", 77654, booksOnLoan);

        //User details
        System.out.println("Library Member Info");
        System.out.println("User Name: " + user.getName());
        System.out.println("Library Card#: " + user.getLibraryCardNumber());
        System.out.println("Book on loan: ");
        //Books on loan
        List<Book> userBooksOnLoan = user.getBooksOnLoan();

        for (Book book : userBooksOnLoan) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Category: " + book.getCategory());
            System.out.println("Is on loan: " + book.isOnLoan());
            System.out.println();

        }

        //User details
        System.out.println("User Name: " + user.getName());
        System.out.println("Library Card#: " + user.getLibraryCardNumber());
        System.out.println("Book on loan: ");

        book1.setisOnLoan(true);

        //Updates list
        System.out.println("Updated Book List");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Is on loan: " + book1.isOnLoan());

    }

}