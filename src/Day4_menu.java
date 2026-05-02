import java.util.Scanner;

public class Day4_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 숫자 합계");
            System.out.println("2. 최댓값 찾기");
            System.out.println("3. 짝수 합 구하기");
            System.out.println("4. 홀수 개수 세기");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int input = sc.nextInt();

            if (input == 1){
                int sum = 0;

                while(true){
                    System.out.print("숫자 입력 : ");
                    input = sc.nextInt();

                    if (input == 0){
                        System.out.println("합계 : " + sum);
                        break;
                    }

                    sum += input;
                }
            } else if (input == 2) {
                System.out.print("입력 : ");
                input = sc.nextInt();

                if (input == 0) continue;

                int max = input;

                while(true) {
                    System.out.print("입력 : ");
                    input = sc.nextInt();

                    if (input == 0) {
                        System.out.println("가장 큰 값 : " + max);
                        break;
                    }

                    if (input > max) {
                        max = input;
                    }
                }
            } else if (input == 3) {
                System.out.print("입력 : ");
                input = sc.nextInt();
                int sum = 0;

                while (true) {
                    System.out.print("입력 : ");
                    input = sc.nextInt();
                    if (input == 0){
                        System.out.println("짝수의 합은 : " + sum);
                        break;
                    } else if (input % 2 == 0) {
                        sum += input;
                    }
                }
            } else if (input == 4) {
                int count = 0;
                while (true) {
                    System.out.print("입력 : ");
                    input = sc.nextInt();

                    if (input == 0) {
                        System.out.println("홀수 개수 : " + count);
                        break;
                    }

                    if (input % 2 == 1) {
                        count++;
                    }
                }
            } else if (input == 5) {
                break;
            }
        }
    }
}
