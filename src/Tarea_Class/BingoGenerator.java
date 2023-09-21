package Tarea_Class;

import java.util.ArrayList;
import java.util.Random;

// Codigo del profesor
public class BingoGenerator {
    public static void main(String[] args) {
        char[] bingoLetters = {'B', 'I', 'N', 'G', 'O'};
        int[] minValues = {1, 16, 31, 46, 61};
        int[] maxValues = {15, 30, 45, 60, 75};
        ArrayList<String> bingoNumbers = new ArrayList<>();
        Random random = new Random();

        // Llena la lista con las combinaciones de letra y número del bingo
        for (int i = 0; i < bingoLetters.length; i++) {
            char letter = bingoLetters[i];
            int minValue = minValues[i];
            int maxValue = maxValues[i];
            for (int j = minValue; j <= maxValue; j++) {
                bingoNumbers.add(letter + Integer.toString(j));
            }
        }

        // Baraja las bolas aleatoriamente
        for (int i = bingoNumbers.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Intercambia bingoNumbers[i] y bingoNumbers[j]
            String temp = bingoNumbers.get(i);
            bingoNumbers.set(i, bingoNumbers.get(j));
            bingoNumbers.set(j, temp);
        }

        // Simula sacar una bola del bingo (repetir este paso según sea necesario)
        int index = random.nextInt(bingoNumbers.size());
        String drawnBall = bingoNumbers.remove(index);

        System.out.println("Bola sacada del bingo: " + drawnBall);
    }
}

