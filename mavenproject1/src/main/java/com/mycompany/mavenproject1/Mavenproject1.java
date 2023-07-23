/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author huseynibadzade
 */
public class Mavenproject1 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your wheight");
//        int weight = scanner.nextInt();
//        System.out.println("Enter ypur height:");
//        double height = scanner.nextDouble();
//        double bki = weight / (height * height);
//        
//        System.out.println("your" + bki);

          Scanner scanner = new Scanner(System.in);
          int frist_number;
          int second_number;
          System.out.print("Frist number: ");
          frist_number =  scanner.nextInt();
          
          System.out.println("Second number: ");
          
          second_number = scanner.nextInt();
          
          System.out.println("Before changes");
          
          System.out.println("Frist number: " + frist_number + "Second number: " + second_number);
           int rem = frist_number;
           frist_number = second_number;
           second_number = rem;
           
           System.out.println("Frist number: " + frist_number + "Second number: " + second_number);
          

    }
}
