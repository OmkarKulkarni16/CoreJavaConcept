package com.library;

import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        BooksManagment b1 = new BooksManagment();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Book ID");
        int bookId = sc.nextInt();
        sc.nextLine();
        b1.setBookId(bookId);

        System.out.println("Enter Book Name");
        String bookName = sc.nextLine();
        b1.setBookName(bookName);
//        sc.nextLine();

        System.out.println("Enter Student Name");
        String studentName = sc.nextLine();
        b1.setStudentName(studentName);
//        sc.nextLine();

        System.out.println("Enter Author Name");
        String authorName = sc.nextLine();
        b1.setAuthorName(authorName);

        System.out.println("Book SuccessFully Added");

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Details :-");

        System.out.println("Name of Student :-  " + b1.getStudentName());
        System.out.println("Name of Book :-   " + b1.getBookName());
        System.out.println("Author Name :-   " + b1.getAuthorName());
        System.out.println("Book ID :-   " + b1.getBookId());


    }

}
