// Fig. 8.11: TestEnum.java
// Test of the Book enum type.

package com.java.chapter8;

import java.util.EnumSet;

public class TestEnum {

    public static void main(String args[]) {

        System.out.println("All books:\n");
        // prints all books in the Book enum
        for (Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear());

        System.out.println("\nDisplay a range of enum constants:\n");
        // prints the first four books
        for (Book book : EnumSet.range(Book.JHTP6, Book.CPPHTP4))
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightYear());

    } // end of main

} // end of class TestEnum
