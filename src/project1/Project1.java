/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;

/**
 *
 * @author krish
 */import java.util.Scanner;
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a word: ");
        String word = scanner.next();       
        
        // Store each character of word in an array
        char[] charArray = word.toCharArray();

        // Print the word in reverse by iterating backwards over the array
        System.out.print("Reversed word: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);

    }
    
    } 
