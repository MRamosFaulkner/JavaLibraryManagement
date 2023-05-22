public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private int pages;
    private String category;//fiction, non-fiction, science, history
    private boolean isOnLoan;

    //Constructor - initializes
    public Book (String title, String author, int publicationYear, int pages, String category, boolean isOnLoan) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.pages = pages;
        this.category= category;
        isOnLoan = false;
        }

    //Setters & Getters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isOnLoan() {
        return isOnLoan;
    }

    public void setisOnLoan(boolean onLoan) {
        isOnLoan = onLoan;
    }
}
