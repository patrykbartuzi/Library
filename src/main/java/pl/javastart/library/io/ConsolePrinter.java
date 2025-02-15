package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.LibraryUser;
import pl.javastart.library.model.Magazine;
import pl.javastart.library.model.Publication;

import java.util.Collection;

public class ConsolePrinter {
    public void printBooks(Collection<Publication> publications) {
        long counter = publications
                .stream()
                .filter(p -> p instanceof Book)
                .peek(System.out::println)
                .count();
        if (counter == 0)
            printLine("Brak książek w bibliotece");
    }

    public void printMagazines(Collection<Publication> publications) {
        long counter = publications
                .stream()
                .filter(p -> p instanceof Magazine)
                .peek(System.out::println)
                .count();
        if (counter == 0)
            printLine("Brak magazynów w bibliotece");
    }

    public void printUsers(Collection<LibraryUser> users) {
        for (LibraryUser user : users) {
            printLine(user.toString());
        }
    }


    public void printLine(String text) {
        System.out.println(text);
    }
}
