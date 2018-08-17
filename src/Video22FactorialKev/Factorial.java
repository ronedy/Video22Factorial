
package Video22FactorialKev;

import java.util.*;
import javax.swing.JOptionPane;

public class Factorial {
    
    public void factorialDe(){
        
    Long resultado = 1L;
    
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
    
    for(int x=numero; x > 0; x--){
        
        resultado = resultado*x;
    }
    
    System.out.println("El factorial del numero " + numero + " es " + resultado);
    
    }
    
}
