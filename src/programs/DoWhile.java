package programs;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void AdivinaElNumeroConRetroalimentacion(Scanner scanner){
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100.
        int intentoUsuario;

        System.out.println("Adivina el número entre 1 y 100.");

        // Utiliza un bucle 'do-while' para permitir que el usuario adivine hasta que adivine correctamente.
        do {
            System.out.print("Introduce tu adivinanza: "); // Solicita al usuario ingresar un número.
            intentoUsuario = scanner.nextInt(); // Lee el número ingresado por el usuario.

            if (intentoUsuario == numeroAleatorio) {
                // Si el usuario adivina correctamente, muestra un mensaje de felicitación.
                System.out.println("¡Felicidades! Adivinaste el número.");
            } else if (intentoUsuario < numeroAleatorio) {
                System.out.println("El número es mayor. Sigue intentando."); // Indica que el número secreto es mayor.
            } else {
                System.out.println("El número es menor. Sigue intentando."); // Indica que el número secreto es menor.
            }
        } while (intentoUsuario != numeroAleatorio); // Continúa el bucle hasta que se adivine el número.
    }
    public  static void ContadorRegresivo(Scanner scanner){
        System.out.print("Ingrese un número: "); // Solicita al usuario ingresar un número.

        int contador = scanner.nextInt(); // Inicializa el contador con el número ingresado.

        // Utiliza un bucle 'do-while' para contar desde el número ingresado hasta 1.
        do {
            System.out.println(contador); // Imprime el valor del contador.
            contador--; // Decrementa el contador en 1 en cada iteración.
        } while (contador >= 1);
    }

    public static void main(String[] args) {
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
                    AdivinaElNumeroConRetroalimentacion(scanner);
                    break;
                case 2:
                    ContadorRegresivo(scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0); // Sale del programa.
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }

}
