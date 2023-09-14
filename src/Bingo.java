import java.util.Scanner;
public class Bingo {
     //Imprime una matrix de nxn
    public static void print_matriz(int[][] matrix, int n){
        for (int i=0; i<n;i++){
            for(int j=0; j<n; j++){
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
    
   // Crea el BINGO
    public static int[][] creat_bingo(int n){
        Random random = new Random();
        int[] minValues = {1, 16, 31, 46, 61};
        int[] maxValues = {15, 30, 45, 60, 75};
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!(i ==2 && j==2)){
                    int tmp = random.nextInt(minValues[i], maxValues[i]); 
                    matrix[i][j] = tmp;
                }else{
                    matrix[2][2]=-1;
                }
            }
        }
        return matrix;
    }
    // RadomNumberBingo
    public static int randomNumber(){
        Random random = new Random();
        int n = random.nextInt(75);
        return n;
    }

    // SearcheNumber
    public static int[][] searchNumber(int[][] matrix, int numberSearch){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(numberSearch == matrix[i][j]){
                    matrix[i][j] = -2;
                }
            }
        }
        return matrix;
    }

    // Jugando
    public static int[][] ifgame(int[][] matrix){
        return searchNumber(matrix, randomNumber());
    } 

    /*Creando Matrix Diagonal
    public static int[][] diag_matrix(Scanner scan,int n){
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.printf("Ingrese el numero en la posicion (%d,%d): ", i, j);
                    matrix[i][j]= scan.nextInt();
                }else{
                    matrix[i][j]= 0;
                }
            }
        }
        return matrix;
    }*/

    public static void main(String[] args){
        int[][] bingo = creat_bingo(5);
        int[][] bingo2;
        // boolean game = true;
        System.out.println("========= Cartilla inicial del Bingo =========");
        print_matriz(bingo, 5);
        System.out.println("========= Bingo despues de 10 jugadas =========");
        for(int i=0;i<10;i++){
           bingo2 = ifgame(bingo);
           bingo = bingo2;
        }
        print_matriz(bingo, 5);
    }
    
}
