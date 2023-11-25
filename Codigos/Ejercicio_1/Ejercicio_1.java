/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectointegraodr;
import java.util.Scanner;
/**
 *
 * @author asa
 */
public class ProyectoIntegraodr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        Scanner o = new Scanner(System.in);

        // Obtener las coordenadas de los puntos A y B
        System.out.println("Ingrese las coordenadas del punto A (x1 y1): ");
        double x1 = o.nextDouble();
        double y1 = o.nextDouble();

        System.out.println("Ingrese las coordenadas del punto B (x2 y2): ");
        double x2 = o.nextDouble();
        double y2 = o.nextDouble();

        // Calcular la pendiente (m)
        double pendiente = (y2 - y1) / (x2 - x1);

        // Calcular la ecuación de la recta en forma general (Ax + By + C = 0)
        double A = pendiente;
        double B = -1;
        double C = -pendiente * x1 + y1;

        // Calcular el ángulo interno α en grados
        double anguloRad = Math.atan(pendiente);
        double anguloGrados = Math.toDegrees(anguloRad);

        // Mostrar la ecuación de la recta y el ángulo interno
        System.out.println("Ecuación de la recta: " + A + "x + " + B + "y + " + C + " = 0");
        System.out.println("Ángulo interno α: " + anguloGrados + " grados");
    }
}

  