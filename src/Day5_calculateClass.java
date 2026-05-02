import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Day5_calculateClass {

    public static void main(String[] args) {
        List<String> history = new ArrayList<>();

        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 계산기 =====");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("5. 종료");
            System.out.println("6. 기록보기");
            System.out.println("7. 기록 삭제");
            System.out.print("선택: ");
            int input = sc.nextInt();

            if (input == 5) break;

            if (input >= 1 && input <= 4) {
                System.out.print("첫번째 숫자 : ");
                int a = sc.nextInt();
                System.out.print("두번째 숫자 : ");
                int b = sc.nextInt();

                if (input == 1) {
                    int result = cal.add(a,b);
                    System.out.println("결과 : " + result);

                    history.add(a + " + " + b + " = " + result);
                } else if (input == 2) {
                    int result = cal.subtract(a,b);
                    System.out.println("결과 : " + result);

                    history.add(a + " - " + b + " = " + result);
                } else if (input == 3) {
                    int result = cal.multiply(a,b);
                    System.out.println("결과 : " + result);

                    history.add(a + " * " + b + " = " + result);
                } else if (input == 4) {
                    while (b == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        System.out.print("두번째 숫자 : ");
                        b = sc.nextInt();
                    }

                    double result = cal.divide(a,b);
                    System.out.println("결과 : " + result);

                    history.add(a + " / " + b + " = " + result);
                }
            } else if (input == 6) {
                if (history.isEmpty()) {
                    System.out.println("기록이 없습니다.");
                } else {
                    for (String record : history) {
                        System.out.println(record);
                    }
                }
            } else if (input == 7) {
                history.clear();
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
