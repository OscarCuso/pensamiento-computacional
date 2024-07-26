
package proyectos_pilares.ejemplo1;

import java.util.Scanner;


public class Comparacion {
    public static void main (String []args){
        float num1, num2;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Dijite un numero: ");
        num1 = entrada.nextFloat();
        System.out.println("Dijita otro numero: ");
        num2 = entrada.nextFloat();
        
        if  (num1 > num2){
         System.out.println("El primer numero es mayor que el segundo " );  
         
        }else if(num1 < num2){
         System.out.println("El primer numero es menor que el segundo ");
            
        }else{
            System.out.println("El primer numero es igual al segundo");
        }
        
        
      
        
        
        
    }
    
}
