import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[][] table = new int[N][M];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                table[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                table[i][j] += sc.nextInt(); 
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) { 
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}