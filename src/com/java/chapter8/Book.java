// Fig. 8.10: Book.java
// Declares an enum type with constructor and explicit instance fields,
// along with accessor methods for these fields.

package com.java.chapter8;

public enum Book {

    // declare enum constants
    JHTP6("Java How to Program 6e", "2005"),
    CHTP4("C How to Program 4e", "2004"),
    IW3HTP3("Internet & World Wide Web How to Program 3e", "2004"),
    CPPHTP4("C++ How to Program 4e", "2003"),
    VBHTP2("Visual Basic .NET How to Program 2e", "2002"),
    CSHARPHTP("C# How to Program", "2002");

    // instance fields
    private final String title;          // book title
    private final String copyrightYear;  // copyright year

    // enum constructor
    Book(String bookTitle, String year) {
        title         = bookTitle;
        copyrightYear = year;
    } // end of Book enum constructor

    // accessor method for title field
    public String getTitle() {
        return title;
    } // end of getTitle method

    // accessor method for copyrightYear field
    public String getCopyrightYear() {
        return copyrightYear;
    } // end of getCopyrightYear method

} // end of Book enum