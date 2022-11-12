package com.adpc.biblioteca;

import java.util.Scanner;
public class Main {


        public static void main(String[] args){
            Scanner entry = new Scanner (System.in);

            String Title;
            String Author;
            String Gender;
            String Releasedate;
            String isbn;
        Book book = new Book();

        System.out.println("Introduce el titulo del libro: ");
        book.setTitle( Title = entry.nextLine());

        System.out.println("Introduce el autor del libro: ");
        book.setAuthor(Author = entry.nextLine());

        System.out.println("Introduce el género: ");
        book.setGender(Gender = entry.nextLine());

        System.out.println("Introduce le fecha de publicación: ");
        book.setReleasedate(Releasedate = entry.nextLine());

        System.out.println("Introduce el ISBN: ");
        book.setIsbn(isbn = entry.nextLine());


        System.out.println("ISBN: " +book.getIsbn());
        System.out.println("Titulo: " +book.getTitle());
        System.out.println("Autor: " +book.getAuthor());
        System.out.println("Genero: " +book.getGender());
        System.out.println("Fecha de publicacion: " +book.getReleasedate());


        Gender gender = new Gender();

        gender.setId(1);
        gender.setName("Novela historica");
        gender. setDescription("Libros para estudiar");

        System.out.println("Id de genero: " +gender.getId());
        System.out.println("Nombre del genero: " +gender.getName());
        System.out.println("Descripcion del genero: " +gender.getDescription());

        Author author = new Author();
        author.setDateofbirth("4/03/1934");
        author.setName("Jose");
        author.setPlaceofbirth("Avila");
        author.setSurname("Diaz");

        System.out.println("Nombre del autor: " +author.getName());
        System.out.println("Apellido: " +author.getSurname());
        System.out.println("Lugar de Nacimiento: " +author.getPlaceofbirth());
        System.out.println("Fecha de nacimiento: " +author.getDateofbirth());

        User user = new User();
        user.setAdress("C/ La flor Nº 10");
        user.setDni("12345678 K");
        user.setName("Pedro");
        user.setSurname("Martinez");
        user.setTelephone(981123546);
        user.setPoblation("Avila");

        System.out.println("Direccion del usuario: " +user.getAdress());
        System.out.println("Nombre: " +user.getName());
        System.out.println("Apellido: " +user.getSurname());
        System.out.println("Telefono: " +user.getTelephone());
        System.out.println("DNI: " +user.getDni());
        System.out.println("Poblacion: " +user.getPoblation());

        Loan loan = new Loan();
        loan.setBook("Libro de Historia Antigua");
        loan.setLoandate(11/10/2022);
        loan.setReturndate(11/11/2022);
        loan.setUser("Pedro Martinez");

        System.out.println("Libro prestado: " +loan.getBook());
        System.out.println("Fecha del prestamo: " +loan.getLoandate());
        System.out.println("Fecha de la devolucion: " +loan.getReturndate());
        System.out.println("Usuario al que es prestado: " +loan.getUser());

    }
}