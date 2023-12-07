package programs;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DoublyLinkedList {
    public static void ListaDoblementeEnlazadaNumeros(){
        // Creamos una lista doblemente enlazada para almacenar números enteros.
        List<Integer> numeros = new LinkedList<>();

        // Agregamos números a la lista.
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);

        System.out.println("Números en la lista:");

        // Utilizamos un iterador para recorrer la lista y mostrar los números.
        ListIterator<Integer> iterador = numeros.listIterator();
        while (iterador.hasNext()) {
            int numero = iterador.next();
            System.out.println(numero);
        }
    }
    public static void ListaDoblePeliculas(Scanner scanner){
        // Creamos una lista para almacenar películas favoritas.
        List<String> peliculas = new LinkedList<>();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar película");
            System.out.println("2. Eliminar película");
            System.out.println("3. Mostrar películas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumimos la línea en blanco después de la entrada.

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una nueva película: ");
                    String nuevaPelicula = scanner.nextLine();
                    peliculas.add(nuevaPelicula);
                    System.out.println("Película agregada con éxito.");
                    break;
                case 2:
                    if (!peliculas.isEmpty()) {
                        System.out.println("Lista de películas:");

                        // Utilizamos un iterador para mostrar las películas numeradas.
                        ListIterator<String> iterador = peliculas.listIterator();
                        while (iterador.hasNext()) {
                            int indice = iterador.nextIndex();
                            String pelicula = iterador.next();
                            System.out.println((indice + 1) + ". " + pelicula);
                        }

                        System.out.print("Ingrese el número de película a eliminar: ");
                        int numeroPelicula = scanner.nextInt();
                        scanner.nextLine(); // Consumimos la línea en blanco.

                        if (numeroPelicula >= 1 && numeroPelicula <= peliculas.size()) {
                            peliculas.remove(numeroPelicula - 1);
                            System.out.println("Película eliminada con éxito.");
                        } else {
                            System.out.println("Número de película no válido.");
                        }
                    } else {
                        System.out.println("La lista de películas está vacía.");
                    }
                    break;
                case 3:
                    if (!peliculas.isEmpty()) {
                        System.out.println("Lista de películas:");

                        // Utilizamos un iterador para mostrar las películas numeradas.
                        ListIterator<String> iterador = peliculas.listIterator();
                        while (iterador.hasNext()) {
                            int indice = iterador.nextIndex();
                            String pelicula = iterador.next();
                            System.out.println((indice + 1) + ". " + pelicula);
                        }
                    } else {
                        System.out.println("La lista de películas está vacía.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0); // Salimos del programa.
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Adivina el numero con retroalimentacion");
            System.out.println("2. Contador regresivo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ListaDoblementeEnlazadaNumeros();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0); // Sale del programa.
                    scanner.close();
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
