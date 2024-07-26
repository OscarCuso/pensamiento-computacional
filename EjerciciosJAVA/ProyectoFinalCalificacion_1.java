
package proyectos_pilares.ejemplo1;

import java.util.Scanner;

public class Calificacion_1 {
    public static void main(String[]args){
        
        float calif = 0;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Digite su calificacion: ");
            calif = entrada.nextFloat();
            
        }while (calif < 1 || calif > 10);
        
        if( calif >= 7 ) {
            System.out.println("Aprobado");
                    
        }else{
            System.out.println("No aprobado");
            
        }
        
        
    }
    
}
