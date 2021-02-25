/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1seleccion55473;

/**
 *
 * @author Denilson
 */
import java.util.Scanner;
public class Ejercicio1Seleccion55473 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Primer numero");
        int num1 = entrada.nextInt();
        
        System.out.println("Segundo numero");
        int num2 = entrada.nextInt();
        
        System.out.println("Tercero numero");
        int num3 = entrada.nextInt();
        
        if(num1 > num2 && num1 > num3){
            
            System.out.println("El numero " + num1 + " es mayor");
         
        }else if(num2 > num1 && num2 > num3){
            
            System.out.println("El numero " + num2 + " es el mayor ");
            
        }else {
            
            System.out.println("El numero " + num3 + " es el mayor");
        }
    }
    
}
