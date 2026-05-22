import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttractionRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Attraction> attractions = new ArrayList<>();

        List<RideRecord> records = new ArrayList<>();

        //Attraction a1 = new Attraction();
        //a1.id = 1;
        //a1.name = "아틀란티스";
        // 위에 처럼하면 코드가 너무 늘어나서 생성자로 한번에 넣기
        attractions.add(new Attraction(1,"아틀란티스"));
        attractions.add(new Attraction(2,"혜성특급"));
        attractions.add(new Attraction(3,"자이로드롭"));
        attractions.add(new Attraction(4,"자이로스윙"));

        while(true) {
            System.out.println("1. 기록 추가");
            System.out.println("2. 기록 보기");
            System.out.println("3. 기록 삭제");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int input = sc.nextInt();

            if (input == 4) break;

            if (input >= 1 && input <= 3)   {
                if (input == 1) {
                    addRecord(sc, attractions, records);
                } else if (input == 2) {
                    printRecord(records);
                } else if (input == 3) {
                    deleteRecord(sc, records);
                }
            }
        }
    }

    private static void addRecord(Scanner sc, List<Attraction> attractions, List<RideRecord> records) {
        //기록 추가
        for(Attraction attraction : attractions) {
            System.out.println(attraction.id + ". " + attraction.name);
        }

        System.out.print("선택: ");
        int choice = sc.nextInt();
        //selected 변수 안에
        //Attraction 객체 저장
        Attraction selected = attractions.get(choice - 1);

        System.out.println("방문하신 날짜를 입력하세요.");
        String date = sc.next();

        System.out.println("대기시간을 입력하세요.");
        int waitTime = sc.nextInt();
        RideRecord record = new RideRecord();
        record.attractionName = selected.name;
        record.date = date;
        record.waitTime = waitTime;

        records.add(record);
    }

    public static void printRecord(List<RideRecord> records){
        // 기록 보기
        for (RideRecord record : records){
            System.out.println(record.attractionName + " / " + record.waitTime + "분 / " + record.date);
        }
    }

    public static void deleteRecord(Scanner sc, List<RideRecord> records) {
        // 기록 삭제
        if (records.isEmpty()) {
            System.out.println("기록이 없습니다.");
        } else {
            for (int i = 0; i < records.size(); i++) {
                RideRecord record = records.get(i);

                System.out.println(
                        (i + 1) + ". " +
                                record.attractionName + " / " +
                                record.waitTime + "분 / " +
                                record.date);
            }
            System.out.println("삭제할 기록을 고르세요.");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= records.size()) {
                records.remove(choice - 1);
            }

        }
    }
}
