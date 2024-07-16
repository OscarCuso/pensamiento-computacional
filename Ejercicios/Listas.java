
package proyectos_pilares.ejemplo1;

import java.util.ArrayList;
import java.util.List;


public class Ejemplo2 {

    public static void main(String[] args) {
        int LIMITE = 10; 
        List lista = new ArrayList();
        int resultado = 0;
        
        
        for (int i= 0; i<=LIMITE-1; i= i+1){
            //System.out.println(i+1);
            lista.add(i+1);
        }
        System.out.println(lista);
        
        for (int i=0; i<=LIMITE-1; i= i+1){
            resultado= (int)lista.get(i) + resultado;         
        }
        System.out.println(resultado);
        
    }
}