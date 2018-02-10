/*Presentado por: Johan Sebastián Sánchez Vargas 20172020061
Daysi Carolina Yara 20172020077
Diego Galeano 20172020074*/
package area.y.perimetro.de.un.cuadrado;

import java.util.Scanner;


public class AreaYPerimetroDeUnCuadrado {
    
    public static void main(String[] args) {
       int lado ;
        System.out.println("Bienvenido, este programa le ayuda a calcular el area y el perimetro de un cuadrado, necesitaremos unicamente la medida de uno de los lados del cuadrado.");
        System.out.println("Ingrese el lado del cuadrado");
        Scanner sc = new Scanner (System.in);
        lado = sc.nextInt();
        if (lado<0){
            System.out.println("No se puede calcular con longitudes negativas.");
        }
        else{
        System.out.println("El area es: "+(lado*lado)+".");
        System.out.println("El perimetro es: " + (lado*4)+".");
        }
    }
    
}
