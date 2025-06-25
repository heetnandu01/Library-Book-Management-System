public class Book {
    private int id;
    private String title;
    private String author;

    Book(int id,String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String toString(){
        return id + " : " + title + " : " + author ;
    }
}