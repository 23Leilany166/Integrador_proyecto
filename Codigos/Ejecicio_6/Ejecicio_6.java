import java.util.Scanner;

public class Ejecicio_6 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        

        Scanner datos = new Scanner(System.in);

        int nbits,combinaciones;

        
        System.out.println("Ingresa la cantidad de bits: ");
        nbits = datos.nextInt();

        //El programa tiene un maximo de 4 bits
        if (nbits<=4) {
            
            //Calcularemos la cantidad de posibles combinaciones
            combinaciones = (int) Math.pow(2, nbits);

            for (int i = 0; i < nbits; i++){

                System.out.print("bit "+(nbits - i - 1)+"\t");
        
            }

            System.out.println("Salidas: ");

            //Separador
            for (int i = 0; i<nbits; i++){
                System.out.print("---------------");
            }

            //Imprimir las combinaciones
            for (int i = 0; i < combinaciones; i++){

                for(int j = 0; j < nbits; j++){

                    int bit = (i>>j)& 1;
                    System.out.print(bit+"\t");

                }
                System.out.println(i);
            }

            //Las salidas que queremos que imprima
            System.out.println("Ingresa la cantidad de salidas: ");
            int cantidadS = datos.nextInt();
            int[] salidas = new int[cantidadS];

            for (int i = 0; i<cantidadS; i++){

                System.out.println("Teclea las salida "+i+": ");
                salidas[i] = datos.nextInt();

            }

            //Generar la exprecion booleana dependiendo a los bits ingrasado
            switch (nbits) {
                case 1 -> {
                    System.out.println("La expresión booleana es: ");
                    for (int j = 0; j<cantidadS; j++){
                        if (salidas[j]==0) {
                            System.out.print(" A ");  
                        }
                        if (salidas[j]==1) {
                            System.out.print(" ¬A ");  
                        }  
                         if (j+1 < cantidadS) {
                            System.out.print(" + ");  
                        }              
                    }
                }
                case 2 -> {
                    System.out.println("La expresión booleana es: ");
                    for (int j = 0; j<cantidadS; j++){
                        if (salidas[j]==0) {
                            System.out.print(" ¬A ¬B "); //00
                        }
                        if (salidas[j]==1) {
                            System.out.print(" ¬A B ");  //01
                        }
                        if (salidas[j]==2) {
                            System.out.print(" A ¬B ");  //10
                        }
                        if (salidas[j]==3) {
                            System.out.print(" A B ");  //11
                        }  
                        if (salidas[j]==4) {
                            System.out.print(" ¬A ¬B "); //00
                        }
                        if (j+1 < cantidadS) {
                            System.out.print(" + ");  
                        }
                                    
                    }
                }
                case 3 -> {
                    System.out.println("La expresión booleana es: ");
                    for (int j = 0; j<cantidadS; j++){
                        if (salidas[j]==0) {
                            System.out.print(" ¬A ¬B ¬C ");  //000
                        }
                        if (salidas[j]==1) {
                            System.out.print(" ¬A ¬B C ");  //001
                        }
                        if (salidas[j]==2) {
                            System.out.print(" ¬A B ¬C ");  //010
                        }
                        if (salidas[j]==3) {
                            System.out.print(" ¬A B C ");  //011
                        }  
                        if (salidas[j]==4) {
                            System.out.print(" ¬A B C ");  //100
                        }
                        if (salidas[j]==5) {
                            System.out.print(" A ¬B C ");  //101
                        }
                        if (salidas[j]==6) {
                            System.out.print(" A B ¬C ");  //110
                        }
                        if (salidas[j]==7) {
                            System.out.print(" A B C ");  //111
                        } 
                        if (j+1 < cantidadS) {
                            System.out.print(" + ");  
                        }
                                    
                    }
                }
                case 4 -> {
                    System.out.println("La expresión booleana es: ");
                    for (int j = 0; j<cantidadS; j++){
                        if (salidas[j]==0) {
                            System.out.print(" ¬A ¬B ¬C ¬D ");  //0000
                        }
                        if (salidas[j]==1) {
                            System.out.print("¬A ¬B ¬C D ");  //0001
                        }
                        if (salidas[j]==2) {
                            System.out.print("¬A ¬B C ¬D ");  //0010
                        }
                        if (salidas[j]==3) {
                            System.out.print("¬A ¬B C D ");  //0011
                        }  
                        if (salidas[j]==4) {
                            System.out.print("¬A B ¬C ¬D ");  //0100
                        }
                        if (salidas[j]==5) {
                            System.out.print("¬A B ¬C D ");  //0101
                        }
                        if (salidas[j]==6) {
                            System.out.print(" ¬A B C ¬D ");  //0110
                        }
                        if (salidas[j]==7) {
                            System.out.print(" ¬A B C D ");  //0111
                        } 
                        if (salidas[j]==8) {
                            System.out.print("A ¬B ¬C ¬D ");  //1000
                        }
                        if (salidas[j]==9) {
                            System.out.print(" ¬A B C ¬D ");  //1001
                        }
                        if (salidas[j]==10) {
                            System.out.print(" A ¬B C ¬D ");  //1010
                        }
                        if (salidas[j]==11) {
                            System.out.print(" A ¬B C D ");  //1011
                        }  
                        if (salidas[j]==12) {
                            System.out.print(" A B ¬C ¬D ");  //1100
                        }
                        if (salidas[j]==13) {
                            System.out.print(" A B ¬C D ");  //1101
                        }
                        if (salidas[j]==14) {
                            System.out.print(" A B C ¬D  ");  //1110
                        }
                        if (salidas[j]==15) {
                            System.out.print(" A B C D");  //1111
                        } 
                        if (j+1 < cantidadS) {
                            System.out.print(" + ");  
                        }
                                    
                    }
                }
         }





        } else {

            System.out.println("Una discupa nuestro programa solo maneja un maximo de 4 bits");
        }


    }
}
