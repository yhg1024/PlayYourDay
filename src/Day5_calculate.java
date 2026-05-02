import java.util.Scanner;

public class Day5_calculate {

    public static void main(String[] args) {
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

            System.out.print("첫번째 숫자 : ");
            int first_input = sc.nextInt();
            System.out.print("두번째 숫자 : ");
            int second_input = sc.nextInt();

            if (input == 1) {

                int sum = first_input + second_input;
                System.out.println("결과 : " + sum);

            } else if (input == 2) {

                int minus = first_input - second_input;
                System.out.println("결과 : " + minus);

            } else if (input == 3) {

                int multiply = first_input * second_input;
                System.out.println("결과 : " + multiply);

            } else if (input == 4) {
                if (second_input != 0) {
                    double divide = (double) first_input / second_input;
                    System.out.println("결과 : " + divide);
                }
            } else if (input == 5) {
                break;
            }
        }
    }
}
