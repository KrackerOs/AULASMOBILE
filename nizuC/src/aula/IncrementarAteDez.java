package aula;

public class IncrementarAteDez {
    public static void main(String[] args) {
        int x = 0; 
        
        System.out.println("Iniciando incremento...");
        
       
        while (x < 10) {
            x++; 
            System.out.println("x = " + x);
        }
        
        System.out.println("Valor final de x: " + x);
    }
}