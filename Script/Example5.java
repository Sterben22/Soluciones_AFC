/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.scrips;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author sterben
 */
public class Example5 {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cuantos numeros quiere sumar: ");
        int n = scan.nextInt();
        scan.nextLine();    //despues de scan.Int el siguiente numero es 0 por eso 
        
        System.out.println("Ingrese la serie que quiere sumar: ");
        String s1= scan.nextLine();
        String[] arr = s1.split("\\s"); //String -> Array con delimitador " "
        
        int sum=0;
        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(arr[i]);    //String -> Int
            sum += temp;
        }
        
        System.out.printf("La suma es %d",sum);
        
        
    } 
}
