public class Book {
    private String author;
    private String title;

    public static void main(String[] args){
        Book book = Book.of("Stephen King","The Stand");
        System.out.println("Autor: " + book.author + ", Tytuł: " + book.title);
    }

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title){
        return new Book(author,title);
    }
}
