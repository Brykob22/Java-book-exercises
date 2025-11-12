// Fig. 6.11: Scope.java
// The Scope class demonstrates the scopes of fields and local variables.

package com.java.chapter6;

public class Scope {

    // field accessible to all methods in this class
    private int x = 1;

    // the start method creates and initializes the local variable x
    // and calls the methods useLocalVariable and useField
    public void start() {

        int x = 5; // the local variable x in the method hides the field x

        System.out.printf("The local x in the start method is %d\n", x);

        useLocalVariable(); // useLocalVariable has the local x
        useField();         // useField uses the Scope class field x
        useLocalVariable(); // useLocalVariable resets the local x
        useField();         // the field x of the Scope class retains its value

        System.out.printf("\nThe local x in the start method is %d\n", x);

    } // end of method start

    // creates and initializes the local x variable each time it is called
    public void useLocalVariable() {

        int x = 25; // initialized each time useLocalVariable is called

        System.out.printf("\nThe local x at entry to useLocalVariable is %d\n", x);
        ++x; // modifies the local x variable of this method
        System.out.printf("The local x before exiting useLocalVariable is %d\n", x);

    } // end of method useLocalVariable

    // modifies the Scope class field x each time it is called
    public void useField() {

        System.out.printf("\nThe field x at entry to useField is %d\n", x);
        x *= 10; // modifies the Scope class field x
        System.out.printf("The field x before exiting useField is %d\n", x);

    } // end of method useField

} // end of class Scope