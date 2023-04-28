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
public class Libros_DAEH {
    
    /*
    Recordar 
    books -> es el arreglo de arreglos
    Se divide en:
        books[x][0] -> Titulo
        books[x][1] -> Autor
        books[x][2] -> Año
        books[x][3] -> Precio
    
    Falta añadir como tener guardado el arreglo si queremos añadir
    un nuevo libro a un arreglo ya hecho.
    
    */
    
    //Menu
    public static int menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("\tBienvenido!!\b");
        System.out.println("1. Añadir un Libro");
        System.out.println("2. Buscar una Libro");
        System.out.println("3. Listar todos los Libros");
        System.out.println("4. Calcular el Precio");
        System.out.println("5. Salir");
        System.out.println("==========================");
        System.out.println("Ingrese una opcion");
        int opc = in.nextInt();
        in.nextLine();
        System.out.println("==========================");
        return opc;
    }
    
    //Añadir
    public static String[][] add(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Cuantos Libros va añadir");
        int n = in.nextInt();   //-> "Numero"+ /n
        in.nextLine();  // Guarda el /n 
        
        String [][] temp = new String[n][];
        //temp = [[""Libro1","Autor1","Año1","Precio1"],["Libro2","Autor2","Año2","Precio2"]...["LibroN","AutorN","AñoN","PrecioN"]]
        
        for(int i = 0; i < n; i++){
            temp[i] = new String[4];
            int cont = i + 1;
            System.out.println("Libro numero" + cont);
            
            System.out.print("Ingrese el titulo del Libro: ");
            temp[i][0] = in.nextLine().toLowerCase();
            
            System.out.print("Ingrese el autor del Libro: ");
            temp[i][1] = in.nextLine().toLowerCase();
            
            System.out.print("Ingrese el año de publicacion del Libro: ");
            temp[i][2] = in.nextLine();
            
            System.out.print("Ingrese el precio del Libro: ");
            temp[i][3] = in.nextLine();
            
            System.out.print("\n");
        }
        
        return temp;
    }
    
    //Buscar
    public static void search(String[][] books){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo del libro que dea buscar: ");
        String book = in.nextLine().toLowerCase();  //Cien Años De Soledad -> toLowerCase -> cien años de soledad
        int n = books.length;
        
        
        for(int i=0; i<n; i++){
            if(books[i][0] == null ? book == null : books[i][0].equals(book)){  // books[i][0] == book
                System.out.println("==========================");
                System.out.printf("Titulo: %s \n",books[i][0]);
                System.out.printf("Autor: %s \n",books[i][1]);
                System.out.printf("Año de publicacion: %s \n",books[i][2]);
                System.out.printf("Precio: %s \n",books[i][3]);
                System.out.println("==========================");
            }
        }
        
        
    }
    
    //Listar 
    public static void shows(String[][] books){
        int n = books.length;
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        for(int i=0; i<n; i++){
            int cont = i+1;
            System.out.printf("Libro %d: \n",cont);
            System.out.printf("Titulo: %s \n",books[i][0]);
            System.out.printf("Autor: %s \n",books[i][1]);
            System.out.printf("Año de publicacion: %s \n",books[i][2]);
            System.out.printf("Precio: %s \n",books[i][3]);
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
    
    //Precio
    public static void prices(String[][] books){
        int n = books.length;
        float suma=0;
        for(int i=0; i<n; i++){
            suma += Float.valueOf(books[i][3]);
        }
        System.out.printf("El precio total de todos los libro es %.2f\n", suma);
    }
    
    //Principal
    public static void main(String[] args) {
        String[][] books = {};   //Lista books
        
        int opc = 0;
        do{
            opc = menu();
            
            switch(opc){
                case 1 -> { //Añadir un Libro
                    books = add();
                }
                case 2 -> { //Buscar una Libro
                    search(books);
                }
                case 3 -> { //Listar todos los Libros
                    shows(books);
                }
                case 4 -> { //Calcular el Precio
                    prices(books);
                }
                case 5 -> {
                }
                default -> System.out.println("Seleccione una opción correcta!\n");
            }
        }while(opc != 5);
    }
}
