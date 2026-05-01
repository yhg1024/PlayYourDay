public class Day3 {
    public static void main(String[] args) {
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
