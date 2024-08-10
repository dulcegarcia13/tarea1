/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promedioexamenes;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PromedioExamenes {

    public static void main(String[] args) {
       Scanner scanner = new 
            Scanner(Systemen.in);
       
       //leer las notas de los examenes 
       System.out.print("ingrese la primera nota:");
       double nota1 = 
               scanner.nextDouble();
       System.out.print("ingrese la segunda nota");
       double nota2 = 
               scanner.nextDouble();
       System.out.print("ingrese la tercera nota");
       double nota3 = 0;
       
        System.out.print("ingrese la cuarta nota:");
        double nota4 = 0;
        
        //calcular promedio
        
         double promedio=(nota1 + nota2 + nota3 + nota4)/ 4;
         
         
         //mostrar resultado 
         System.out.print("El resultado de las notas es: "+ promedio);
               
       
    }
}
