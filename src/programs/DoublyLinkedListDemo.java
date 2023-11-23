package programs;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class DoublyLinkedListDemo {
    public static class MovieList {
        private List<String> peliculas = new LinkedList<>();

        public void agregarPelicula(String nuevaPelicula) {
            peliculas.add(nuevaPelicula);
        }

        public boolean eliminarPelicula(int numeroPelicula) {
            if (numeroPelicula >= 1 && numeroPelicula <= peliculas.size()) {
                peliculas.remove(numeroPelicula - 1);
                return true;
            }
            return false;
        }

        public void mostrarPeliculas() {
            if (!peliculas.isEmpty()) {
                System.out.println("Lista de películas:");
                ListIterator<String> iterador = peliculas.listIterator();
                while (iterador.hasNext()) {
                    int indice = iterador.nextIndex();
                    String pelicula = iterador.next();
                    System.out.println((indice + 1) + ". " + pelicula);
                }
            } else {
                System.out.println("La lista de películas está vacía.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieList movieList = new MovieList();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar película");
            System.out.println("2. Eliminar película");
            System.out.println("3. Mostrar películas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea en blanco

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una nueva película: ");
                    String nuevaPelicula = scanner.nextLine();
                    movieList.agregarPelicula(nuevaPelicula);
                    System.out.println("Película agregada con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese el número de película a eliminar: ");
                    int numeroPelicula;
                    try {
                        numeroPelicula = scanner.nextInt();
                        scanner.nextLine(); // Consumir la línea en blanco
                        if (movieList.eliminarPelicula(numeroPelicula)) {
                            System.out.println("Película eliminada con éxito.");
                        } else {
                            System.out.println("Número de película no válido.");
                        }
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Por favor, ingrese un número válido.");
                        scanner.nextLine(); // Consumir la entrada no válida
                    }
                    break;
                case 3:
                    movieList.mostrarPeliculas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close(); // Cerrar el Scanner antes de salir
                    System.exit(0); // Salir del programa.
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
