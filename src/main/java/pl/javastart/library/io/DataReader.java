package pl.javastart.library.io;

import pl.javastart.library.model.Book;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook() {
        System.out.print("Tytuł: ");
        String title = sc.nextLine();
        System.out.print("Autor: ");
        String author = sc.nextLine();
        System.out.print("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Rok wydania: ");
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.print("Ilość stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }
}