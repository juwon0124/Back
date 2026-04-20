import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 사용자에게 입력받기 위한 객체
		
		int[] arr = new int[9]; // 숫자 9개를 저장하기 위해 정수형 배열 
		
		for(int i = 0; i < 9; i++) { // 배열에 저장하기 위해 0부터 8까지 9번 반복하는 for문 사용
			arr[i] = sc.nextInt(); // 입력받은 숫자를 배열에 하나씩 넣음
		}
		
		int max = arr[0];
		int index = 0;
		/* 배열의 첫 번째 값을 초기 최댓값으로 설정
		   그 위치를 나타내는 인덱스를 0으로 초기화
		*/
		
		for(int i = 1; i < 9; i++) { // 최댓값과 위치를 비교하면서 갱신하는 반복문
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max); // max 값을 출력
		System.out.println(index + 1); // 배열 시작은 0이므로 +1를 더해 출력
	}

}
