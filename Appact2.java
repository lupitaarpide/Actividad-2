//Parte 1. Strings y estructuras de selección
package Semana2.Act2;
import java.util.Scanner;

public class Appact2 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        //nombre a comparar
        String nombreCorrecto = "Lupita";

        System.out.print("Escribe tu nombre: ");
        String nombreUsuario = sc.nextLine();

        //comparacion
        if (nombreUsuario.equals(nombreCorrecto)) {
            System.out.println("Woola" + nombreUsuario + "Tu nombre si coincide");

        } else {
            System.out.println("Tu nombre no coincide, ADIOS");
        }

    sc.close();


// ---------------------------------------------------------------------------------------------------------------------
//Parte 2. Estructuras de repetición y arreglos

    //Es para los 50 números pares entre el 2 y 100
            int[] pares = new int[50];
            int indice = 0;

            // Para generar y guaradar los números pares
            for (int i = 2; i < 100; i += 2) {
                pares[indice] = i;
                indice++;
            }

            // Para imrprimir los valores se usa otro for
            for (int i = 0; i < pares.length; i++) {
                System.out.println(pares[i]);
            }
    }
}
