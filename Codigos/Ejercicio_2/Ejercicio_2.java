import java.util.Scanner;
/**
 *
 * @author Leilany Aislinn
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
       //Ingresar los valores para la  formula general 
        Scanner p=new Scanner(System.in);
        double x1,x2;
        System.out.println("ingresa el valor de a: ");
        double a=p.nextDouble();
        System.out.println("ingresa el valor de b : ");
        double b=p.nextInt();
        System.out.println("ingresa el valor de c:   ");
        double c=p.nextDouble();
        
        double discriminante=b * b - 4 * a * c;//Formula general
        
        if(discriminante>0){//los reales 
         x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
         x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Existen dos raice reales :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
    }else if(discriminante==0){//Los complejoa
        x2 = (-b )/ (2 * a);
         System.out.println("Existe una unica raiz: "+ x2 );
        System.out.println("x2: " +x2);  
        }else{
        System.out.println("No tiene raices reales, son complejas: ");
    }
        
    } 
}

    
    

