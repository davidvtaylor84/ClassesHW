import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int countNumberOfBooksInLibrary(){
        return this.collection.size();
    }

    public void addBookToLibrary(Book book){
        if(this.capacity > this.countNumberOfBooksInLibrary()){
        this.collection.add(book);}
    }

    public void removeBookFromLibrary(Book book){
        this.collection.remove(0);
    }

    public void lendBook(Book book, Borrower borrower){
        this.removeBookFromLibrary(book);
        borrower.addBookToBorrowersCollection(book);
    }

}
