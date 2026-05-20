import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttractionRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Attraction> attractions = new ArrayList<>();

        //Attraction a1 = new Attraction();
        //a1.id = 1;
        //a1.name = "아틀란티스";
        // 위에 처럼하면 코드가 너무 늘어나서 생성자로 한번에 넣기
        attractions.add(new Attraction(1,"아틀란티스"));
        attractions.add(new Attraction(2,"혜성특급"));
        attractions.add(new Attraction(3,"자이로드롭"));
        attractions.add(new Attraction(4,"자이로스윙"));

        for(Attraction attraction : attractions) {
            System.out.println(attraction.id + ". " + attraction.name);
        }

        System.out.print("선택: ");
        int choice = sc.nextInt();

        //selected 변수 안에
        //Attraction 객체 저장
        Attraction selected = attractions.get(choice -1);

        RideRecord record = new RideRecord();
        record.attractionName = selected.name;

        System.out.println(record.attractionName);
    }
}
