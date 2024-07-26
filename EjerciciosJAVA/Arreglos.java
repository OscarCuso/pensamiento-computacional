package proyectos_pilares.ejemplo1;



public class Ejemplo1 {

    public static void main(String[] args) {
        int LIMITE = 10;
        int [] numeros = new int[LIMITE];
        int resultado = 0;
        
        // 0 <= 99
        for(int i = 0; i <= LIMITE - 1; i = i + 1){
            numeros[i] = i + 1;
            System.out.println("Posición: " + i + " Valor: " + (i + 1));
        }
        
        
        for(int i = 0; i < LIMITE; i = i +1){
            System.out.println("*****************************************");
            System.out.println("Resultado: " + resultado + "\nPosición: " + i + "\nNumeros["+i+"]: " + (i + 1) + "\nResultado: " + resultado + " + " + numeros[i] );
            resultado = numeros[i] + resultado;
            System.out.println("\nResultado: " + resultado ) ;
            
        }
        
        System.out.println(resultado);
        
        
    }
}
