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


public class Example3 {
    public static double calcTemp(int T, String u1, String u2){
        double newT = 0;
        
        if(u1 == null ? u2 == null : u1.equals(u2)){
            newT = T; 
        }else if("C".equals(u2)){ // De F||K -> C
            if("F".equals(u1)){
                newT = (T-32)*(5/9);
            }
            if("K".equals(u1)){
                newT = T - 273.15;
            }
        }else if("F".equals(u2)){ // De C||K -> F
            if("C".equals(u1)){
                newT = T*(9/5) + 32;
            }
            if("K".equals(u1)){
               newT = (T-273.15)*(9/5) + 32;
            }
        }else if("K".equals(u2)){// De C||F -> K
            if("C".equals(u1)){
                newT = T + 273.15;
            }
            if("F".equals(u1)){
                newT = ((T-32)*(5/9)) + 273.15;
            }
        }
        
        return newT;
    }
    
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        
        double newT=0;
        String u2="";
        int T=0;
        String u1="";
        
        
        
        System.out.println("==================================");
        System.out.println("1. Convertir a Celsius ");
        System.out.println("2. Convertir a Farenheit");
        System.out.println("3. Convertir a Kelvin");
        System.out.println("==================================");
        
        
        System.out.println("Ingrese una opcion:");
        int opc = scan.nextInt();
        switch(opc){
            case 1 -> {
                System.out.println("Temperatura que quiere Convertir: ");
                T = scan.nextInt();
                
                scan.nextLine();
                System.out.println("Unidades: ");
                u1 = scan.nextLine();
                
                u2="C";
                
                newT = calcTemp(T,u1,u2);
            }
            case 2 -> {
                System.out.println("Temperatura que quiere Convertir: ");
                T = scan.nextInt();
                
                scan.nextLine();
                System.out.println("Unidades: ");
                u1 = scan.nextLine();
                
                u2="F";
                
                newT = calcTemp(T,u1,u2);
            }
            case 3 -> {
                System.out.println("Temperatura que quiere Convertir: ");
                T = scan.nextInt();
                
                scan.nextLine();
                System.out.println("Unidades: ");
                u1 = scan.nextLine();
                
                u2="K";
                
                newT = calcTemp(T,u1,u2);
            }
        }
        
        System.out.printf("La temperatura %d %s en %s es %.2f",T,u1,u2,newT);
        
    }
}
