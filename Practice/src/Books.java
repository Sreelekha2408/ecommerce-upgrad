import java.time.Year;

public class Books {
    String title;
    String author;
    int yearPublished;

    // Parameterized constructor
    public Books(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public static void main(String[] args) {
        Books[] books = new Books[3];
        books[0] = new Books("Java: The Complete Reference", "Herbert Schildt", 2021);
        books[1] = new Books("Clean Code: A Handbook of Agile Software Craftsmanship",
                "Robert C. Martin",2008);
        books[2] = new Books("The Alchemist", "Paulo Coelho", 1988);
        for(Books book: books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year Published: " + book.getYearPublished() +"\n");
        }
    }
}
