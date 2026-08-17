package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    List<Book> books = new ArrayList<>();

    void bookIRead(){
        Book firstBook = books.get(0);
        System.out.println("Я читаю книгу: ["+firstBook.title+"]");
    }
}
