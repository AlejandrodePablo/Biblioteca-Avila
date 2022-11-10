
import java.util.*;
public class Main {


        public static void main(String[] args){
            Scanner entry = new Scanner (System.in);

            String title;
            String author;
            String gender;
            String releasedate;
            String isbn;
        Book book = new Book();

        System.out.println("Introduce el titulo del libro: ");
        book.setTitle( title = entry.nextLine());

        System.out.println("Introduce el autor del libro: ");
        book.setAuthor(author = entry.nextLine());

        System.out.println("Introduce el género: ");
        book.setGender(gender = entry.nextLine());

        System.out.println("Introduce le fecha de publicación: ");
        book.setReleasedate(releasedate = entry.nextLine());

        System.out.println("Introduce el ISBN: ");
        book.setIsbn(isbn = entry.nextLine());


        System.out.println("ISBN: " +book.getIsbn());
        System.out.println("Titulo: " +book.getTitle());
        System.out.println("Autor: " +book.getAuthor());
        System.out.println("Genero: " +book.getGender());
        System.out.println("Fecha de publicacion: " +book.getReleasedate());


    }
}
