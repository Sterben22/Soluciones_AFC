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
public class Example1 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int n = scan.nextInt();
        
        int cont=0;
        for(int i=1; i<n+1; i++){
            if(i%2 == 0){
                cont +=1;
            }
        }
        
        System.out.printf("Hasta el numero %d existen %d numero pares",n,cont);
    }
}
