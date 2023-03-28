/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atm_project;

import java.util.Scanner;

/**
 *
 * @author huseynibadzade
 */
public class Atm_project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        String works = "1. Work : Account Info\n"
                        + "2. Work : Withdrawl Money\n"
                        + "3. Work : Deposite Money\n"
                        + "Press q for Exit";
        System.out.println("*******************************");
        System.out.println(works);
        System.out.println("*******************************");
        
        while (true) {            
            System.out.println("Isleminizi Seciniz: ");
            String work = scanner.nextLine();
            
            if (work.equals("q")) {
                System.out.println("Exiting Program");
                break;
            }
            else if (work.equals("1")) {
                System.out.println("Balance "+ balance);
                
            }
            else if (work.equals("2")) {
                System.out.println("Amount of money: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                
                if (balance - amount <0) {
                    System.out.println("there is no enaugh money. Balance:" + balance);
                }
                else {
                    balance -= amount;
                    System.out.println("New balance: " + balance);
                }
            }
            else if (work.equals("3")) {
                int amount = scanner.nextInt();
                scanner.nextLine();
                balance += amount;
                System.out.println("New Balance: " + balance);
            }
            else {
                System.out.println("Wrong work");
            }
        }
    }
}
