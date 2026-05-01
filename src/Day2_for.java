import java.util.Scanner;

public class Day2_for {
    public static void main(String[] args) {
        //같은 작업을 여러 번 자동으로 돌리기
        //“코드 줄이는 감각” 익히기

        // 오른쪽 정렬 별 찍기
        // 공백 + 별 2개 필요

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // 안보고 거꾸로 별 찍기
        for (int i = 5; i >= 1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 거꾸로 출력
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 별 찍기 (중첩 반복문 응용)
        // 총 5줄
        // 첫 줄: 별 1개
        // 마지막 줄: 별 5개
        for (int i = 0; i <= 5; i++) { // 줄
            for (int j = 0; j < i; j++) { // 별 개수
                System.out.print("*");
            }
            System.out.println();
        }

        // Q7 2~9단 전체 출력 (가로 정렬)
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "x" + i + " ");
            }
            System.out.println();
        }

        // Q6 사용자가 숫자 입력하면 그 단 출력
        Scanner sc = new Scanner(System.in);

        System.out.println("구하고 싶은 단을 입력하세요.");
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + "X " + i + " = " + dan*i);
        }

        // Q5 구구단 2단 ~ 5단까지 출력
        for (int i = 2; i <= 5; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i*j);
            }
        }

        // Q4 구구단 2단 출력
        for (int i = 1; i < 10; i++) {
            System.out.println("2 X " + i + " = " + (2*i));
        }

        // Q3 1부터 10까지 합 구하기
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Q2 1부터 10까지 출력
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Q1 “Hello” 5번 출력하기
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
