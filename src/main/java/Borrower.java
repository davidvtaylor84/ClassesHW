import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowersCollection;

    public Borrower(String name){
        this.name = name;
        this.borrowersCollection = new ArrayList<>();
    }

    public int countBooksInBorrowersCollection(){
        return this.borrowersCollection.size();
    }

    public void addBookToBorrowersCollection(Book book){
        this.borrowersCollection.add(book);
    }
}
