import java.util.*;

public class LibraryDatabase {
    Map<Integer, Book> db = new LinkedHashMap<>();

    void addBook(int id, String title, String author) {
        if (db.containsKey(id)) {
            System.out.println("Book with this ID already exists.");
            return;
        }

        Book b = new Book(id, title, author);
        db.put(id, b);
        System.out.println("Book added.");
    }

    void viewBooks(){
        if(db.isEmpty()){
            System.out.println("No books");
            return;
        }else{
            for(Book b : db.values()){
                System.out.println(b);
            }
        }
    }

    void searchBook(int id){
        if(db.containsKey(id)){
            Book b = db.get(id);
            System.out.println(b);
        }
        else{
            System.out.println("Books not found");
        }
    }

    void removeBook(int id){
        if(db.containsKey(id)){
            Book b = db.remove(id);
            System.out.println(b);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
