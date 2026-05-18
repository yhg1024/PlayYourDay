import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day7_user2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        while (true ) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 회원목록 보기");
            System.out.println("4. 회원삭제");
            System.out.println("5. 종료");
            System.out.print("선택 : ");

            int input = sc.nextInt();

            //1. 회원가입
            // 아이디 중복 체크
            if (input == 1) {
                System.out.println("아이디를 입력하세요.");
                String id = sc.next();

                boolean exists = false;

                for (User user : users) {
                    if (user.id.equals(id)) {
                        System.out.println("이미 존재하는 아이디입니다.");
                        exists = true;
                        break;
                    }
                }
                if (exists) {
                    continue;
                }

                System.out.println("비밀번호를 입력하세요.");
                String password = sc.next();

                User user = new User();
                user.id = id;
                user.password = password;
                user.num = users.size() + 1;

                users.add(user);
                System.out.println(user.num);
            } else if (input == 2) {
                //2. 로그인
                // 성공 / 실패 출력
                System.out.println("아이디를 입력하세요.");
                String id = sc.next();

                System.out.println("비밀번호를 입력하세요.");
                String password = sc.next();

                boolean found = false;

                for (User user : users) {
                    if(user.id.equals(id) && user.password.equals(password)) {
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
                //3. 회원목록
                // 번호 붙여서 출력
                    for (User user : users) {
                        System.out.println(user.num + ". " +user.id);
                }
            } else if (input == 4){
                //4. 회원삭제
                // 아이디 입력받고 찾기
                System.out.println("삭제할 아이디를 입력하세요");
                String id = sc.next();

                for (User user : users) {
                    if (user.id.equals(id)) {
                        users.remove(user);
                    }
                }
            } else if (input == 5) {
                //5. 종료
                System.out.println("종료합니다.");
                break;
            }
        }

        //List에 숫자 저장
        ArrayList<Integer> list = new ArrayList<>();

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
