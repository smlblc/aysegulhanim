package day33.JavaEnum.Ex2;



import java.util.ArrayList;

public class Store {

    //Part1
    //given arrayList of books, print only books with FANTASY category

    public static void main(String[] args) {
        Store store= new Store();
        store.printFantasyBook();

    }
   public void printFantasyBook(){
       ArrayList<Book> list=getBooks();
       for (Book books:list) {
          // if (books.getBookCategory()==BookCategory.FANTASY) System.out.println(books);
           // if yerine switch case ile de yazabiliriz
           switch (books.getBookCategory()) {
               case NOVEL:
                   break;
               case SCIENCE_FICTION:
                   break;
               case FANTASY:
                   System.out.println("My fantasy book--> "+books);
                   break;
               case COMICS:
                   break;
               case MAGAZINES:
                   break;
               case ECONOMY:
                   break;
           }
       }
   }

    public  ArrayList<Book> getBooks() {
        ArrayList<Book> list = new ArrayList<>();
        Book book1 = new Book("To Kill Mockinbird", BookCategory.NOVEL);
        Book book2 = new Book("Investing 101", BookCategory.ECONOMY);
        Book book3 = new Book("Neuromancer", BookCategory.FICTION);
        Book book4 = new Book("Leila Mecnun", BookCategory.CLASSIC);
        Book book5 = new Book("The Witcher", BookCategory.FANTASY);

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);

        return list;
    }
}
