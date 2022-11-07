/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.exerciseratio0;

import java.util.Scanner;

/**
 *
 * @author pgervill
 */
public class ExerciseRatio0 {

    public static void main(String[] args) {
//        Scanner inScanner = new Scanner (System.in);
//        String numExercice = "";
//        boolean inError = false;
        
        /*System.out.println("Elige el número ejercicio:\n");
        for (int i=1; i<=7; i++)
            System.out.println("Ejercicio "+i+".\n");
        while(!inError){
            inError = false;
            numExercice = inScanner.nextLine();
            switch(numExercice){
                case "1":
                    exercice.isPalindromeWord("abcfcba");
                    break;
                default:
                    System.out.println(numExercice+"   No me he enterado, escribe solo UN numero");
                    inError = true;
            }
            
        }*/
        //1. Palindrome word
        System.out.println(Exercises.isPalindromeWord("abcfcba"));
        System.out.println(Exercises.isPalindromeWord("abcfcjba"));
        
        //2. Palindrome number
        System.out.println(Exercises.isPalindromeNumber(1234454321));
        System.out.println(Exercises.isPalindromeNumber(1234554321));
        
        //3. Factorial
        System.out.println(Exercises.factorial(7));
        
        //4. MCD
        System.out.println(Exercises.mcd(324,180));
        
        //5. Armstrong number
        System.out.println(Exercises.armstrong(1634));
        
        //6. Reverse String
        System.out.println(Exercises.reverseString("Caca de la vaca paca de la pradera de alpacas"));
        
        //7. Rice bags
        Exercises.riceBags(64);
        
        //Extra. Rock paper scissors
        //exercice.ppt();
        
    }
}
