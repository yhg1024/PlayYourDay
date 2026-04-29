public class Day2_for {
    public static void main(String[] args) {
        //같은 작업을 여러 번 자동으로 돌리기
        //“코드 줄이는 감각” 익히기

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
