package proyectos_pilares.ejemplo1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        String nombres; 
        Map<Integer, String> empleados = new HashMap<>();
        
        final int LIMITE = 5;
        int num = 1001; 
        for(int i = 0; i <= LIMITE -1; i = i + 1){
            System.out.println("Digita el nombre");
            nombres = entrada.nextLine(); 
            System.out.println(nombres);
            
            empleados.put(num + i, nombres);
        }
        System.out.println(empleados);
        
    }
}
