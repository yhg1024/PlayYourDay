import java.util.ArrayList;
import java.util.List;

public class Day7_user2 {
    public static void main(String[] args) {
        //List에 숫자 저장
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //합계 출력
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println(sum);

        //최댓값 출력
        int max = list.get(0);

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);

        //짝수만 출력
        for (int num : list) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
