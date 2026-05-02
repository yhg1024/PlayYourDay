import java.util.Random;
import java.util.Scanner;

public class Day3_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Q2 짝수만 더하기
        int input;
        int sum = 0;

        while (true) {
            System.out.print("입력 : ");
            input = sc.nextInt();
            if (input != 0 && input % 2 == 0) {
               sum += input;
            } else if (input == 0){
                System.out.println("짝수 합 : " + sum);
                break;
            }
        }

        // Q1 0을 입력할 때까지 계속 숫자 입력받기
        //숫자 계속 입력
        //입력한 숫자 모두 더하기
        //0 입력하면 종료
        //최종 합 출력
        // int input= 0;
        // int sum = 0;

        while (true) {
            System.out.print("숫자 입력 : ");
            input = sc.nextInt();
            if (input != 0) {
                sum += input;
            } else {
                System.out.println("합계: " + sum);
                break;
            }
        }

        //컴퓨터가 1~100 숫자 하나 정함
        //내가 계속 숫자 입력
        //맞출 때까지 반복
        //정답보다 크면 → “DOWN”
        //작으면 → “UP”
        //시도 횟수 출력
        Random random = new Random();

        int answer = random.nextInt(100)+1;
        // int input = 0;
        int count = 0;

        while (input != answer) {
            System.out.print("숫자를 입력하세요 : ");
            input = sc.nextInt();
            count++;

            if (input > answer) {
                System.out.println("DOWN");
            } else if (input < answer) {
                System.out.println("UP");
            } else {
                System.out.println("정답입니다! (" + count + "번 만에 성공)");
            }
        }


        // 가운데 정렬
        // 별 1-3-5-7-9 증가
        for (int i = 1; i <= 5; i++) { // 5줄
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 오른쪽 별찍기 복습
        for (int i = 1; i <= 5; i++) { // 5줄
            for (int j = 1; j <= 5-i; j++) { // 공백 4-3-2-1-0
                System.out.print(" ");
            }
            for (int j = 1; j < i+1; j++) { // 별 1-2-3-4-5
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
