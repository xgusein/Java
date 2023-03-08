/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.weight_project;

import java.util.Scanner;

/**
 *
 * @author huseynibadzade
 */
public class Weight_project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much money: ");
        double money = scanner.nextDouble();
        System.out.println("How much kilometr: ");
        int km = scanner.nextInt();
        System.out.println("Total amount: " + (money * km) + "$");
        
        
    }
}
