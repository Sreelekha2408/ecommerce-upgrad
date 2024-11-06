import java.util.ArrayList;

public class BookShelf{
//    ArrayList<Book> books;
//    public BookShelf() {
//        books = new ArrayList < Book > ();
//    }
    private ArrayList<Book> books = new ArrayList<>();


    void addBook(Book book){
        books.add(book);
    }
    void removeBook(Book book) {
        books.remove(book);
    }
    void replaceBook(Book book, int index){
        books.set(index, book);
    }
    void displayAllBooks() {
        System.out.println("Books on the Bookshelf:");
        for(Book book: books){
            System.out.println("Title: "+ book.title + ", Author: "+book.author+", Genre: "+book.genre);
        }
    }

    public static void main(String[] args) {
        BookShelf books = new BookShelf();
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee", "Classic");
        Book b2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        Book b3 = new Book("Twisted Games", "Ana Hung", "Romance");
        Book b4 =  new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy");
        books.addBook(b1);
        books.addBook(b2);
        books.displayAllBooks();
        books.removeBook(b2);
        books.addBook(b4);
        System.out.println();
//        books.displayAllBooks();
//        books.replaceBook(b3, 1);
        books.displayAllBooks();
    }
}
class Book {
    String title;
    String author;
    String genre;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}