import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1=new Book("Les Misérables",1000);
        Book b2=new Book("Dune",650);
        Book b3=new Book("1984",340);
        Book b4=new Book("Duygusal Zeka",450);
        Book b5=new Book("Yüzüklerin Efendisi: Yüzük Kardeşliği",444);

        TreeSet<Book> books = new TreeSet<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);


        System.out.println();
        System.out.println("Books sorted by name");
        System.out.println("--------------------------------------------------------------------------------");
        for (Book b: books){
            System.out.println(b);
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();

        Set<Book> booksSetByPageNum=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum()-o2.getPageNum();
            }
        });


        booksSetByPageNum.add(b1);
        booksSetByPageNum.add(b2);
        booksSetByPageNum.add(b3);
        booksSetByPageNum.add(b4);
        booksSetByPageNum.add(b5);

        System.out.println();
        System.out.println("Books sorted by page num");
        System.out.println("--------------------------------------------------------------------------------");
        for (Book b: booksSetByPageNum){
            System.out.println(b);
        }
        System.out.println("--------------------------------------------------------------------------------");






    }
}