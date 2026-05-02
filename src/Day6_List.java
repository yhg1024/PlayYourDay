import java.util.ArrayList;
import java.util.List;

public class Day6_List {
    public static void main(String[] args) {
        // Q1 숫자 5개 List에 넣고 전부 출력
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int num : list) {
            System.out.println(num);
        }
    }
}
