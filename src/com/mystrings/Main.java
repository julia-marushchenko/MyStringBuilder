/**
 *  Java program to demonstrate StringBuilder class.
 */

package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating StringBuilder variable.
        StringBuilder sb = new StringBuilder("I like programming");

        // Printing sb value to console.
        System.out.println(sb); // Output: I like programming

        // Modifying sb.
        sb.append(" and coffee");

        // Printing sb value to console.
        System.out.println(sb); // Output: I like programming and coffee

        // Inserting string in sb.
        sb.insert(18, ", yoga ");

        // Printing sb value to console.
        System.out.println(sb); // Output: I like programming, yoga  and coffee

        // Replacing 'like' with 'love'
        sb.replace(2, 6,"love");

        // Printing sb value to console.
        System.out.println(sb); // Output: I love programming, yoga  and coffee

    }
}