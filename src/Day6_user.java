import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<User> users = new ArrayList<>();

        while (true) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 회원목록 보기");
            System.out.println("4. 종료");
            System.out.print("선택 : ");

            int input = sc.nextInt();

            if (input == 4) break;

            if (input >= 1 && input <= 3) {
                if (input == 1) {
                    // 아이디 입력
                    System.out.print("아이디를 입력하세요 : ");
                    String id = sc.next();


                    // 비밀번호 입력
                    System.out.print("비밀번호를 입력하세요 : ");
                    String pw = sc.next();

                    // User 객체 생성
                    User user = new User();
                    user.id = id;
                    user.password = pw;

                    // List에 추가
                    users.add(user);

                } else if (input == 2) {
                    // 아이디 입력
                    System.out.print("아이디를 입력하세요 : ");
                    String id = sc.next();

                    // 비밀번호 입력
                    System.out.print("비밀번호를 입력하세요 : ");
                    String pw = sc.next();

                    boolean found = false;

                    for (User user : users) {
                        if (user.id.equals(id) && user.password.equals(pw)) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("로그인 성공");
                    } else  {
                        System.out.println("로그인 샐패");
                    }

                } else if (input == 3) {
                    for (User user : users) {
                        System.out.println(user.id);
                    }
                }
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
