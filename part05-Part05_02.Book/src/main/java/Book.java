public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String author_name,String book_name, int pages_count){
        this.author = author_name;
        this.name = book_name;
        this.pages = pages_count;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }

    public String toString(){
        return this.author +", "+this.name +", "+getPages()+" pages";
    }
}
