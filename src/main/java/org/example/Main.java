package org.example;

import org.apache.commons.lang3.StringUtils;

/**
 * The {@code App} class demonstrates a simple example of reversing a string using the
 * Apache Commons Lang {@link StringUtils} library.
 *
 * <p>This class includes a {@code main} method that reverses a given string and prints
 * the result to the console.</p>
 *
 * <p>Example usage:</p>
 * <pre>
 *     Hello, Maven!
 * </pre>
 *
 * <p>Output:</p>
 * <pre>
 *     !nevaM ,olleH
 * </pre>
 */
class App {

    /**
     * The entry point of the application.
     *
     * <p>This method initializes a string, reverses it using {@link StringUtils#reverse(String)},
     * and prints the reversed result to the console.</p>
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Hello, Maven!";
        String reversedText = StringUtils.reverse(text);
        System.out.println(reversedText);
    }
}
