import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 숫자 3개 입력받기
        // 가장 큰 수 출력하기
        System.out.println("첫번째 숫자: ");
        int a = sc.nextInt();
        System.out.println("두번째 숫자: ");
        int b = sc.nextInt();
        System.out.println("세번째 숫자: ");
        int c = sc.nextInt();

        if (a >= b &&  a >= c) {
            System.out.println("첫번째 숫자가 가장 큽니다.");
        } else if (b >= a && b >= c) {
            System.out.println("두번째 숫자가 가장 큽니다.");
        } else {
            System.out.println("세번째 숫자가 가장 큽니다.");
        }

        // Q2 숫자 2개 입력받기
        System.out.println("첫 번째 숫자: ");
        int number1 = sc.nextInt();

        System.out.println("두 번째 숫자:");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("더 큰 수: " + number1);
        } else if (number1 < number2){
            System.out.println("더 큰 수: " + number2);
        } else {
            System.out.println("두 수가 같습니다.");
        }


        // Q1 3의 배수도 같이 판별
        int number = sc.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("짝수이면서 3의 배수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }

    private static Scanner getSc(Scanner sc) {
        return sc;
    }
}