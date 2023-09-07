import java.util.Scanner;
public class Bingo {
    //Imprime una matrix de nxn
    public static void print_matriz(int[][] matrix, int n){
        for (int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]!=-1){
                    System.out.print(matrix[i][j]+" ");
                }else{System.out.print("FREE ");}
            }
            System.out.println();
        }
    }
    
    // Crea el BINGO
    public static int[][] creat_bingo(Scanner scan,int n){
        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!(i ==2 && j==2)){
                    System.out.printf("Ingrese el numero en la posicion (%d,%d): ", i, j);
                    matrix[i][j]= scan.nextInt();
                }else{
                    matrix[2][2]=-1;
                }
            }
        }
        return matrix;
    }

    //Creando Matrix Diagonal
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
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int [][] matrix2 = diag_matrix(scan,5);
        print_matriz(matrix2, 5);



        scan.close();
    }
    
}
