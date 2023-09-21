package programs;
import java.util.Random;
import java.util.Scanner;

public class While {
    public static void AdivinaElNumero(Scanner scanner) {
        Random random = new Random();

        // Genera un número aleatorio entre 1 y 100.
        int numRandom = random.nextInt(100) + 1;
        int intentos = 0; // Inicializa el contador de intentos en 0.
        int intUser;

        System.out.println("Adivina el número entre 1 y 100.");

        // Utiliza un bucle 'while' para permitir que el usuario adivine hasta que adivine correctamente.
        while (true) {
            System.out.print("Introduce tu adivinanza: "); // Solicita al usuario ingresar un número.
            intUser = scanner.nextInt(); // Lee el número ingresado por el usuario.
            intentos++; // Incrementa el contador de intentos en cada intento.

            if (intUser == numRandom) {
                // Si el usuario adivina correctamente, muestra un mensaje de felicitación y el número de intentos.
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break; // Sale del bucle cuando se adivina el número.
            } else if (intUser < numRandom) {
                System.out.println("El número es mayor. Sigue intentando."); // Indica que el número secreto es mayor.
            } else {
                System.out.println("El número es menor. Sigue intentando."); // Indica que el número secreto es menor.
            }
        }
    }

    public static void Contador(Scanner scanner) {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int count = 1;
        while (count <= numero) {
            System.out.println(count);
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Adivina el número");
            System.out.println("2. Contador");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    AdivinaElNumero(scanner);
                    break;
                case 2:
                    Contador(scanner);
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


