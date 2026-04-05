import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] check = new int[31];
		
		for(int i = 0; i < 28; i++) {
			int num = sc.nextInt();
			check[num] = 1;
		}
		
		for(int i = 1; i <= 30; i++) {
			if(check[i] == 0) {
				System.out.println(i);
			}
		}
	}
}