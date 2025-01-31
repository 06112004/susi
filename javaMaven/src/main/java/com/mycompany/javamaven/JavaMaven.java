/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javamaven;

/**
 *
 * @author IT20
 */
import java.util.*;
        
public class JavaMaven {

     public static void main(String[] args) {
        System.out.println("Addition of two numbers");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a:");
        int a=scanner.nextInt();
        System.out.println("Enter b:");
        int b=scanner.nextInt();
        int c=a+b;
        System.out.println("Sum:"+c);
}
}