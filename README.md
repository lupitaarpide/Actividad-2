# ACTIVIDAD 2: Strings, estructuras de selección y de repetición, y arreglos en Java.
## Introducción 

Mi Parte 1 se enfocó en el uso de Strings y estructuras de selección y mi Parte 2 aplica estructuras de repeteción y arreglos. El objetivo es mostrar el manejo básico de entrada de datos, comparación de cadenas de texto, ciclos y almacenamiento de información en arreglos.

### Parte 1: Uso de Strings y estructuras de selección
En la primera parte del programa se utiliza la clase Scanner para leer datos ingresados por el usuario desde el teclado. El dato solicitado es el nombre del usuario, el cual se almacena en una variable de tipo String.
Los Strings se usan para manejar texto y permitir la comparación entre el nombre ingresado por el usuario y un nombre previamente definido en el programa.

Para realizar la comparación se emplea una estructura de selección if-else, junto con el método equals(), el cual permite comparar dos cadenas de texto respetando mayúsculas y minúsculas.

* Si el nombre ingresado coincide exactamente con el nombre definido, el programa muestra un mensaje personalizado.
* Si no coincide, se muestra un mensaje diferente indicando que el nombre no es correcto.

De esta manera, se demuestra el uso de Strings y estructuras de selección para tomar decisiones dentro del programa.



### Parte 2: Uso de estructuras de repetición y arreglos
En la segunda parte del programa se utilizan arreglos y estructuras de repetición para generar y mostrar una lista de números pares.

Primero, se crea un arreglo de tipo int con capacidad para 50 elementos, ya que existen 50 números pares entre el 2 y el 100.

Posteriormente, se usa una estructura de repetición for para generar los números pares e ir almacenándolos en el arreglo.

* El ciclo comienza en 2.

* Se incrementa de 2 en 2 para obtener únicamente números pares.

* Cada número generado se guarda en el arreglo utilizando un índice.

Después, se emplea otro ciclo for para recorrer el arreglo y mostrar los valores almacenados en pantalla.

Aquí se utiliza pares.length para conocer el tamaño del arreglo y evitar errores al acceder a sus posiciones.


## Conclusión
El programa desarrollado integra correctamente conceptos básicos de programación en Java.
En la Parte 1, se aplicaron Strings y estructuras de selección para comparar datos ingresados por el usuario y mostrar mensajes personalizados.
En la Parte 2, se utilizaron estructuras de repetición y arreglos para generar, almacenar y mostrar una secuencia de números pares.

## Código completo
´´´ java 

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


 ---------------------------------------------------------------------------------------------------------------------
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

## Código ejecutado
```text
Escribe tu nombre: Lupita
WoolaLupitaTu nombre si coincide
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
0

Process finished with exit code 0

```