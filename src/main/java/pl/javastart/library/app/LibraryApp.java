package pl.javastart.library.app;

public class LibraryApp {
        final static  String APP_NAME = "Biblioteka v1.2";
    public static void main(String[] args) {
        System.out.println(APP_NAME);

        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}