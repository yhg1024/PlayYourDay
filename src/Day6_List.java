import java.util.ArrayList;
import java.util.List;

public class Day6_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Q3 짝수만 출력
        for (int num : list) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        // Q2 List에 있는 숫자 합 구하기
        int result = 0;
        for (int num : list) {
            result += num;
        }
        System.out.println("결과 : " + result);

        // Q1 숫자 5개 List에 넣고 전부 출력
        for (int num : list) {
            System.out.println(num);
        }
    }
}
