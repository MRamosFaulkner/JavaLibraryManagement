import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    //maintains a list of the books by doing the following

    /**
     * adds a book
     * removes a book by title
     * finds all books in a specific year
     * finds all books by author
     * finds the book with most pages
     * finds all the books with more than n pages
     * print all book titles, sorted alphabetically
     * find books in a specific category
     * loan out books and return books -- keeps track of books on loan & cannot loan a book already out
     *
     */

    private List<Book> books;
    private List<User> users;

    //Adds book
    public void addBook(Book book) {
        books.add(book);
    }

    //Removes book
    public void removeBook (Book book) {
        books.remove(book);
    }

    //Finds all books in a specific year
    public List<Book> booksByYear(int publicationYear) {
        return books.stream()
                .filter(book -> book.getPublicationYear() == (publicationYear))
                .collect(Collectors.toList());
    }

    //Finds all books by author
    public List<Book> booksByAuthor (String author) {
        return books.stream()
                .filter(book -> book.getAuthor() == (booksByAuthor()))
                .collect(Collectors.toList());
    }

    //Finds the book with the most pages
    public Book bookWithMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    //Finds books with more than "n" pages
    public List<Book> booksWithNPage(int pageCount) {
        return books.stream();
        filter(book -> book.getPages() > pageCount)
        .collect(Collectors.toList());
    }

    //Prints all books by title alphabetically
    public void booksAlphaOrder() {
        List<String> sortedTitles = books.stream()
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());

        sortedTitles.forEach(System.out::println);
    }


    //Finds books in a specific category
    public List<Book> booksByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    //Loans out books - keeps track of books on loan & cannot loan a book already out
    public void loanedBook(User user, Book book) {
        if (!book.isOnLoan()) {
            book.setisOnLoan(true);
            user.getBooksOnLoan().add(book);
        }
    }

    //Returns books
    public void bookReturned(User user, Book book) {
        if (user.getBooksOnLoan().contains(book)) {
            book.setisOnLoan(false);
            user.getBooksOnLoan().remove(book);
        }
    }

    @FunctionalInterface

    public void processBooks(Consumer<Book> action) {
        for (Book book : books) {
            action.accept(book);
        }
    }

    public void displayBooks() {
        processBooks((Book -> System.out.println(book.getTitle())));
    }

    public void updatedCategories() {
        processBooks(Book ->book.getCategory(book.getCategory().toUpperCase()));
    }
}
