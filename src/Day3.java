public class Day3 {
    public static void main(String[] args) {
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
