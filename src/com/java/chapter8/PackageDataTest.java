// Fig. 8.20: PackageDataTest.java
// Package-access members of a class are accessible
// to other classes in the same package.

package com.java.chapter8;

public class PackageDataTest {

    public static void main(String[] args) {

        PackageData packageData = new PackageData();

        // print the String representation of packageData
        System.out.printf("After instantiating:\n%s\n", packageData);

        // modify package-access data in packageData object
        packageData.number = 77;
        packageData.string = "Goodbye";

        // print the String representation of packageData
        System.out.printf("\nAfter modifying values:\n%s\n", packageData);

    } // end of main

} // end of class PackageDataTest


// class with package-access instance variables
class PackageData {

    int number; // package-access instance variable
    String string; // package-access instance variable

    // constructor
    public PackageData() {
        number = 0;
        string = "Hello";
        
    } // end of PackageData constructor

    // return String representation of PackageData object
    public String toString() {
        return String.format("number: %d; string: %s", number, string);
        
    } // end of toString method

} // end of class PackageData