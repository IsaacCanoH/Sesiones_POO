package sesion18;

import java.util.Scanner;

public class IntegerToBinary {
    public static void main(String[] args) {
        int miNumero = 20;
        String binario = Integer.toBinaryString(miNumero);
        System.out.printf("El Numero %d es en binario --> %S \n",miNumero,binario);

System.out.println("<----------------------------------------->");
//Solicitar al usuario un Número y regresarlo en su forma Binaria

         Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa un número decimal: ");
        int decimal = scanner.nextInt();
        
        String obbinario = decimalToBinary(decimal);
        
     
        System.out.println("El número binario del número  "+decimal+" es --> " + obbinario);
    
        scanner.close();
    }
    
   
    public static String decimalToBinary(int decimal) {
 
        if (decimal == 0) {
            return "0";
        }
        
        
        StringBuilder obbinario = new StringBuilder();
        
      
        while (decimal > 0) {
           
            int residuo = decimal % 2;
            
           
            obbinario.insert(0, residuo);
            
      
            decimal /= 2;
        }
        
      
        return obbinario.toString();
    }
}
    
