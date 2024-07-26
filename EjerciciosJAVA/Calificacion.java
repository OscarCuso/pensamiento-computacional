
package proyectos_pilares.ejemplo1;

import java.util.Scanner;


public class Calificacion {
    public static void main(String[]args){
        float calif = 0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Dijite su calificacion: ");
        calif = entrada.nextFloat();
        
        if (calif >= 9){
            System.out.println("Sobresaliente");
            
        }else if(calif >= 6){
            System.out.println("Aprobado");
            
        }else{
            System.out.println("No aprobado");
            
        }
        
        
    }
    
    
}
