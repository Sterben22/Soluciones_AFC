/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scrips;
import java.util.Scanner;
/**
 *
 * @author sterben
 */
public class Example4 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int n = scan.nextInt();
        int factorial = 1;
        
        while(n!=0){
            factorial = factorial*n; 
            n-= 1;
        }
        
        System.out.printf("El factorial es %d",factorial);
    }
}
