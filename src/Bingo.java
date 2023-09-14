import java.util.Random;

public class Bingo {
    //Imprime una matrix de nxn
    public static void printMatrix(int[][] matrix, int n){
        for (int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(matrix[j][i]>0){
                    System.out.print(matrix[j][i]+"\t");
                }else if(matrix[j][i]!=-1){
                    System.out.print("X\t");
                }else{
                    System.out.print("FREE\t");
                }
            }
            System.out.println();
        }
    }
    
    // Crea la cartilla del BINGO
    public static int[][] createMatrix(int n){
        Random random = new Random();
        int[] minValues = {1, 16, 31, 46, 61};
        int[] maxValues = {15, 30, 45, 60, 75};
        int[][] matrix = new int[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(!(i==2 && j==2)){
                    matrix[i][j] = random.nextInt(minValues[i], maxValues[i]);
                }else{
                    matrix[2][2] = -1;
                }
            }
        }
        return matrix;
    }

    // RadomNumberBingo
    public static int randomNumber(){
        Random random = new Random();
        return random.nextInt(75);
    }

    // SearcheNumber
    public static int[][] searchNumber(int[][] matrix, int numberSearch){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length ; j++){
                if(numberSearch == matrix[i][j]){
                    matrix[i][j] = -2;
                }
            }
        }
        return matrix;
    }

    // Jugando
    public static int[][] ifGame(int[][] matrix){
        return searchNumber(matrix, randomNumber());
    } 
    public static void main(String[] args){
        int[][] bingo = createMatrix(5);
        int[][] bingo2;
        // boolean game = true;
        System.out.println("========= Cartilla inicial del Bingo =========");
        printMatrix(bingo, 5);
        System.out.println("========= Bingo despues de 10 jugadas =========");
        for(int i=0;i<10;i++){
           bingo2 = ifGame(bingo);
           bingo = bingo2;
        }
        printMatrix(bingo, 5);

    }
}
