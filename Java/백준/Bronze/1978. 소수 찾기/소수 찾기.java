import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // 몇 개 입력받을 건지
        int count = 0; // 소수 개수 세는 변수

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num < 2) continue; // 1은 어차피 소수 아니니까 패스한다
            
            boolean check = true; // 일단 소수라고 치고 시작
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    check = false; // 나눠지면 소수 탈락
                    break;
                }
            }
            if (check) count++; // 탈락 안 했으면 카운트+1
        }

        System.out.println(count); // 결과 출력
        sc.close();
    }
}