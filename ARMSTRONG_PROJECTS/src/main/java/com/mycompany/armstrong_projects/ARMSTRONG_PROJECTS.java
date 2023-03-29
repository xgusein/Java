/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.armstrong_projects;

import java.util.Scanner;

/**
 *
 * @author huseynibadzade
 */
public class ARMSTRONG_PROJECTS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println("Number of digits: ");
        int number_digits = scanner.nextInt();
        
        int transit_number = number;
        int sum = 0;
        
        do {            
            int number_amount = transit_number % 10;
            transit_number = transit_number / 10;
            
            sum +=Math.pow(number_amount,number_digits);
        } while (transit_number > 0);
        
        if (number == sum) {
            System.out.println("Numer is Armstrong");
        }
        else {
            System.out.println("NUmber is not Armstrong");
        }
        
    }
}
