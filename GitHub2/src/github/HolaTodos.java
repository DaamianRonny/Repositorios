 
package github;
 
import java.util.Scanner;

public class HolaTodos {
 
    public void saludar (){
       
        Scanner ingreso = new Scanner (System.in);
        int a,b;
        System.out.print("Ingrese el primer valor: ");
        a=ingreso.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        b=ingreso.nextInt();
        System.out.print("La suma de los dos valores ingresados es: "+(a+b)+"\n");
 
  
    }
}
