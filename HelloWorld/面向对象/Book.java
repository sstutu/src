package HelloWorld.面向对象;

public class Book {
    String name;
    //Book b=new Cartoon1();
    public String getName() {
        return name;
    }
    static void printName(Book b) {
        System.out.println(b.getName());
    }
    public static void main(String[] args) {
       Book[]book={new Cartoon1(),new Novel(),new Magazine()};
        for (int i = 0; i <book.length ; i++) {
            Book.printName(book[i]);
        }
    }
}
