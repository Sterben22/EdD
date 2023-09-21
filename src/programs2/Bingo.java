package programs2;

import java.util.Random;
// 4


public class Bingo {
    // Imprime una matriz de tarea.Bingo.
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // Imprime el número de la matriz si es mayor que 0.
                if (matrix[j][i] > 0) {
                    System.out.print(matrix[j][i] + "\t");
                }
                // Imprime "X" si el valor es diferente de -1 (espacio libre).
                else if (matrix[j][i] != -1) {
                    System.out.print("X\t");
                }
                // Imprime "FREE" si el valor es -1 (espacio libre especial).
                else {
                    System.out.print("FREE\t");
                }
            }
            // Agrega una nueva línea después de imprimir una fila completa.
            System.out.println();
        }
    }

    /**
     * Crea la cartilla del BINGO.
     *
     * @param n La cantidad de filas y columnas de la matriz.
     * @return Retorna una matriz de nxn.
     */
    public static int[][] createMatrix(int n) {
        Random random = new Random();
        int[] minValues = { 1, 16, 31, 46, 61 };
        int[] maxValues = { 15, 30, 45, 60, 75 };
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!(i == 2 && j == 2)) {
                    // Genera números aleatorios dentro del rango y los asigna a la matriz.
                    matrix[i][j] = random.nextInt(minValues[i], maxValues[i]);
                } else {
                    // Marca el espacio central como espacio libre especial (-1).
                    matrix[2][2] = -1;
                }
            }
        }
        return matrix; // Devuelve la matriz de tarea.Bingo creada.
    }

    // Genera un número aleatorio para el tarea.Bingo (del 0 al 74).
    public static int randomNumber() {
        Random random = new Random();
        return random.nextInt(75);
    }

    /**
     * Busca un número en la matriz del tarea.Bingo y lo marca si se encuentra.
     * @param numberSearch Numero que se buscara en la matrix
     * @param matrix Matriz donde buscaremos el numero
     * */
    public static int[][] searchNumber(int[][] matrix, int numberSearch) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (numberSearch == matrix[i][j]) {
                    // Marca el número encontrado como -2 (ya ha sido llamado).
                    matrix[i][j] = -2;
                }
            }
        }
        return matrix; // Devuelve la matriz actualizada.
    }

    // Realiza una jugada en el tarea.Bingo: busca y marca un número aleatorio.
    public static int[][] ifGame(int[][] matrix) {
        return searchNumber(matrix, randomNumber());
    }

    public static void main(String[] args) {
        int[][] bingo = createMatrix(5); // Crea la cartilla inicial del tarea.Bingo.
        int[][] bingo2;
        System.out.println("========= Cartilla inicial del tarea.Bingo =========");
        printMatrix(bingo); // Imprime la cartilla inicial.
        System.out.println("========= tarea.Bingo después de 10 jugadas =========");
        int numJugadas = 10;
        while (numJugadas > 0) {
            bingo = ifGame(bingo); // Realiza una jugada y actualiza la matriz de tarea.Bingo.
            numJugadas--;
        }
        printMatrix(bingo); // Imprime la cartilla después de 10 jugadas.
    }
}


