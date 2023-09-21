package programs2;

import java.util.Scanner;
//3

public class ListaSimple {
    static Scanner scan = new Scanner(System.in); // Crear un objeto Scanner para la entrada estándar (teclado).
    static int n; // n para el número de elementos en la lista.
    static int[] list; // Arreglo de enteros para almacenar la lista.

    static void printList() {
        // Comprobar si la lista no es nula (si ha sido creada).
        if (list != null) {
            // Iterar a través de los elementos de la lista.
            for (int i = 0; i < list.length; i++) {
                // Imprimir cada elemento.
                System.out.printf("Elemento %d -> %d \n", i + 1, list[i]);
            }
        } else {
            // Si la lista es nula, mostrar un mensaje de lista vacía.
            System.out.println("La lista está vacía.");
        }
    }

    static int[] createList() {
        // Solicitar al usuario el número de elementos.
        System.out.println("De cuántos elementos es su lista: ");
        n = scan.nextInt(); // Leer el número de elementos ingresado por el usuario.
        int[] arr = new int[n]; // Crear un nuevo arreglo de enteros con la longitud n.
        // Iterar a través de los elementos a ingresar en la lista.
        for (int i = 0; i < n; i++) {
            // Solicitar al usuario el valor de cada elemento.
            System.out.printf("Qué elemento desea guardar en la posición %d -> ", i + 1);
            // Leer el valor del elemento ingresado por el usuario y almacenarlo en el arreglo.
            arr[i] = scan.nextInt();
        }
        return arr; // Devolver el arreglo de enteros creado.
    }

    static void menu() {
        // Iniciar un bucle infinito para mostrar el menú continuamente.
        while (true) {
            System.out.println("""
                    %#%#%#%#%#%#%#%#%#%#%#%#%#%#%#%#%#%#%#%#%
                    Programa usando una lista simple, por favor elija una opción.
                    1.- Crear una nueva lista
                    2.- Mostrar la Lista
                    3.- Salir
                    -> Su opción es: """);

            // Leer la opción elegida por el usuario.
            int option = scan.nextInt();
            // Evaluar la opción ingresada por el usuario.
            switch (option) {
                // Llamar a la función createList para crear una nueva lista.
                case 1:
                    list = createList();
                    break;
                // Llamar a la función printList para mostrar la lista.
                case 2:
                    printList();
                    break;
                case 3:
                    System.out.println("Saliendo del programa."); // Mostrar un mensaje de salida.
                    System.exit(0); // Salir del programa con código de salida 0.
                default:
                    System.out.println("Opción no válida. Intente de nuevo."); // Mostrar un mensaje de opción no válida.
            }
        }
    }

    public static void main(String[] args) {
        menu(); // Llamar a la función menu para iniciar el programa.
    }
}

