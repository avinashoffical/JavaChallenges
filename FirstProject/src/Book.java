public class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks=0;
    }
    {//object init
        totalBooks++;
    }

    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
    }
    public static int getTotalBooks(){
     return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book already borrowed");
        }
        else{
            this.isBorrowed=true;
            System.out.println("Enjoy Book");
        }
    }

     void  returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("Hope you enjoyed");
        }
        else{
            System.out.println("This book is already in library");
        }
    }

    public static void main(String[] args) {
        Book book=new Book("1","design","author");
        Book book2=new Book("2");
        System.out.println(getTotalBooks());
        book.borrowBook();
        book2.borrowBook();
        book.borrowBook();
        book.returnBook();
        book.returnBook();
    }

}
