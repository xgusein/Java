/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project;

import java.util.Scanner;

/**
 *
 * @author huseynibadzade
 */
public class Mini_project {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight:");
        int wheight = scanner.nextInt();
        System.out.println("Enter height:");
        double height = scanner.nextDouble();
        double bki = wheight / (height * height);
        System.out.println("bki:" + bki);
    }
}
