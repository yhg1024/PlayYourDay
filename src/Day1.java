import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int number = sc.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("짝수이면서 3의 배수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}