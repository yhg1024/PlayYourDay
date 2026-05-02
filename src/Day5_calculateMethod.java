import java.util.Scanner;

public class Day5_calculateMethod {

    public static void add(int a, int b) {
        System.out.println("결과 : " + (a+b));
    }

    public static void minus(int a, int b) {
        System.out.println("결과 : " + (a-b));
    }

    public static void multiply(int a, int b) {
        System.out.println("결과 : " + (a*b));
    }
    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        System.out.println("결과 : " + ((double)a/b));
    }

    public static void main(String[] args) {
        // 메서드로 분리하기
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 계산기 =====");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int input = sc.nextInt();

            if (input == 5) break;

            if (input >= 1 && input <= 4) {
                System.out.print("첫번째 숫자 : ");
                int first_input = sc.nextInt();
                System.out.print("두번째 숫자 : ");
                int second_input = sc.nextInt();

                if (input == 1) {
                    add(first_input, second_input);
                } else if (input == 2) {
                    minus(first_input,second_input);
                } else if (input == 3) {
                    multiply(first_input,second_input);
                } else if (input == 4) {
                    divide(first_input,second_input);
                }
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
