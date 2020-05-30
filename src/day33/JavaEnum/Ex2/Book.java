package day33.JavaEnum.Ex2;

public class Book {
    private String name;
    private BookCategory bookCategory;

    public Book(String name, BookCategory bookCategory) {
        this.name = name;
        this.bookCategory = bookCategory;
    }

    public BookCategory getBookCategory(){
        return this.bookCategory;
    }

    @Override
    public String toString() {
        return "\nBook" +"name: " + name +
                "\nbookCategory: " + bookCategory;
    }
}
