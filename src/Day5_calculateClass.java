import java.util.Scanner;

public class Day5_calculateClass {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

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
                int a = sc.nextInt();
                System.out.print("두번째 숫자 : ");
                int b = sc.nextInt();

                if (input == 1) {
                    System.out.println("결과 : " + cal.add(a,b));
                } else if (input == 2) {
                    System.out.println("결과 : " + cal.subtract(a,b));
                } else if (input == 3) {
                    System.out.println("결과 : " + cal.multiply(a,b));
                } else if (input == 4) {
                    if (b == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        System.out.print("두번째 숫자 : ");
                        b = sc.nextInt();
                    }

                    System.out.println("결과 : " + cal.divide(a,b));
                }
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
