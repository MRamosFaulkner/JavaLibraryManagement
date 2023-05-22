import java.util.List;

public class User {

    //Allows users to register to the library
    private String name;
    private int libraryCardNumber;
    private List<Book> booksOnLoan; // books on loan to the user

    //Constructor - initializes
    public User (String name, int libraryCardNumber, List<Book> booksOnLoan) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.booksOnLoan = booksOnLoan;
    }

    //Setters & Getters
    public String getName() {
        return name;
    }

    public void setName(String name) { // in setters you pass
        this.name = name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber (int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public List<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void setBooksOnLoan(List<Book> booksOnLoan) {
        this.booksOnLoan = booksOnLoan;
    }
}
