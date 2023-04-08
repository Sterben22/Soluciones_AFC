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
public class Example2 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        double pi = Math.PI;
        
        System.out.println("Ingrese el radio del circulo: ");
        double radio = scan.nextInt();
        
        double c = radio*pi;
        
        System.out.printf("El area del circulo es %.3f",c);        
        
    }
}
