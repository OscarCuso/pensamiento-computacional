package proyectos_pilares.ejemplo1;

public class Ejemplo3 {
    public static final int COLUMNA = 5;
    private static final int FILA = 5;
    
    public static void main(String[] args) {
        
        int sumaDeFila = 0; 
        int sumaTotal = 0;
        int [][] almacenDeNumeros = new int [FILA][COLUMNA];
        
        for(int i = 0; i < FILA ;i = i + 1 ){
            
            for(int j = 0; j < COLUMNA ; j = j + 1){
                
                almacenDeNumeros [i][j] = j + 1 + i*5 ; 
                System.out.print(j + 1 + i*5 + " ");
            }
            System.out.print("\n");
        }
        for(int i = 0; i < FILA ; i = i + 1){
             
            for (int j = 0; j < COLUMNA; j = j + 1){
                sumaDeFila = almacenDeNumeros [i][j] + sumaDeFila ;
            }
            System.out.println("resultado " + sumaDeFila );
           
            sumaTotal = sumaTotal + sumaDeFila;
           
            sumaDeFila = 0;
            
             
        }
         System.out.println("resultado final " + sumaTotal );
        
        
    }
}
