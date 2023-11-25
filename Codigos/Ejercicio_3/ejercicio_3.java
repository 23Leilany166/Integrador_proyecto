import java.util.Scanner;

public class ejercicio_3 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner dato=new Scanner (System.in);

        float x1,y1,x2,y2;
        float distancia, convercion;
        int r;

        //El primer systen es para ingresar el radio r=radio
        System.out.println("Ingresa el valor del radio: ");
        r = dato.nextInt();

        //Aqui se ingresan los datos del punto C que son x1 y y1
        System.out.println("Ingresa el valor de x1: ");
        x1 = dato.nextFloat();
        System.out.println("Ingresa el valor de y1: ");
        y1 = dato.nextFloat();

        //Aqui se ingresan los datos del punto T que son x2 y y2
        System.out.println("Ingresa el valor de x2: ");
        x2 = dato.nextFloat();
        System.out.println("Ingresa el valor de y2: ");
        y2 = dato.nextFloat();

        //Se realiza la operacion para saber la distancia entre los dos puntos

        float resta1 = x2-x1;
        float resta2 = y2-y1;
        distancia =  (float) Math.sqrt(Math.pow(resta1,2) + Math.pow(resta2,2));


        // Y por ultimo vamos a comparar para ver si el punto T se encuentra dentro de la 
        // de la circunferencia del punto C

        if (distancia < 0) {
            
            convercion = (distancia * (-1));
            if (distancia <= r) {
            
            System.out.println("El punto T se encuentra dentro del area del circunferencia del punto C ");
            System.out.println("La distancia entre los dos puntos es de: "+distancia);

            } else {

            System.out.println("El punto T no se encuentra dentro del area del circunferencia del punto C ");
            System.out.println("La distancia entre los dos puntos es de: "+distancia);
            
    	}
        } else {

            if (distancia <= r) {
            
            System.out.println("El punto T se encuentra dentro del area del circunferencia del punto C ");
            System.out.println("La distancia entre los dos puntos es de: "+distancia);

            } else {

            System.out.println("El punto T no se encuentra dentro del area del circunferencia del punto C ");
            System.out.println("La distancia entre los dos puntos es de: "+distancia);

        }
        

    }
 }
 }