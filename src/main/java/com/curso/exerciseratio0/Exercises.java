/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.exerciseratio0;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pgervill
 */
public class Exercises {
    
    //1. Palindrome word
    public static boolean isPalindromeWord(String word){
        boolean isPalindrome = true;
        int start = 0;
        int end = word.length()-1;
        while(isPalindrome && start < end){
            if (word.charAt(start) == word.charAt(end)){
               start++;
               end--; 
            }else
                isPalindrome = false;
        }
        return isPalindrome;
    }
    
    //2. Palindrome number
    public static boolean isPalindromeNumber(long number){
        boolean isPalindrome = true;
        long divider = 10;
        long left;
        long right;
        while(number/divider >= 9){
            divider*=10;
        }
        
        while(isPalindrome && number != 0){
            left = number / divider;
            right = number % 10;
            
            number %= divider;
            number /= 10;
            if (left == right)
                divider /= 100;
            else
                isPalindrome = false;
        }
        
        return isPalindrome;
    }
    
    //3. Factorial
    public static long factorial(long number){
        if(number > 1)
            return number*factorial(number-1);
        else
            return number;
    }
    
    //4. MCD
    public static long mcd(long number1, long number2){
        if (number1 < number2){
            long aux = number2;
            number2 = number1;
            number1 = aux;
        }
        if (number1%number2 == 0)
            return number2;
        else{
            return mcd(number1,number1%number2);
        }
    }
    
    //5. Armstrong number
    public static boolean armstrong(int number){
        int numberCopy = number;
        boolean isArmstrongNum = false;
        int armstrong=0;
        int digits = 0;
        
        for(int i=number; i > 0; i/=10)
            digits++;
        
        while(number > 0){
            armstrong += Math.pow(number%10,digits);
            number/=10;
        }
        if(armstrong == numberCopy)
            isArmstrongNum = true;
        return isArmstrongNum;
    }
    
    //6. Reverse String
    public static String reverseString(String myString){
        String reverse = "";
        for (int i=0; i<myString.length(); i++)
            reverse += myString.charAt(myString.length()-i-1);
        return reverse;
    }
    
    //7. Rice bags
    public static void riceBags(int kgs){
        int bag1=0;
        int bag3=0;
        int bag5=0;
        System.out.println("Para llegar a "+kgs+"Kgs se necesitan:");
        while(kgs!=0){
            if (kgs-5 >= 0){
                bag5++;
                kgs -= 5;
            }else if (kgs-3 >= 0){
                bag3++;
                kgs -= 3;
            }else if (kgs-1 >= 0){
                bag1++;
                kgs -= 1;
            }
        }
        System.out.println("\tSacos de 1kgs: "+bag1);
        System.out.println("\tSacos de 3kgs: "+bag3);
        System.out.println("\tSacos de 5kgs: "+bag5);
        System.out.println("En total: "+ (bag5+bag3+bag1));
    }
    
    //Extra
    public void ppt(){
        String playerText;
        Scanner scanner = new Scanner (System.in);
        int playerOption=3, consoleOption;
        boolean keepPlaying = true;
        while(keepPlaying){
            do{
                System.out.println("Elige piedra, papel o tijera");
                playerText = scanner.nextLine();
                switch(playerText){
                    case "piedra":
                        playerOption = 0;
                        break;
                    case "papel":
                        playerOption = 1;
                        break;
                    case "tijera":
                        playerOption = 2;
                        break;
                    case "exit":
                        keepPlaying = false;
                        break;
                    default:
                        System.out.println("Eso no se lo que es, escribe bien anda");
                        playerOption = 3;
                }
            }while(playerOption == 3 && keepPlaying);
        
            Random r = new Random();
            consoleOption = r.nextInt(3);
            System.out.println(consoleOption);
            
            if(playerOption < 3 && keepPlaying){
                if(playerOption > consoleOption){
                    if(consoleOption == 0 && playerOption == 2)
                        System.out.println("Perdiste wey");
                    else
                        System.out.println("Ganasteeee");
                }else{
                    if(playerOption == consoleOption)
                        System.out.println("EMPATEEEEEE");
                    else{
                        if(consoleOption == 0)
                            System.out.println("Ganasteeee");
                        else
                            System.out.println("Perdiste wey");
                    }
                }
            }
        }
    }
}
