package Cal2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String command = "";
        do {
            try {
                System.out.println("안녕하세요 계산기입니다.");

                System.out.print("숫자를 입력해주세요: ");
                int number1 = sc.nextInt();

                System.out.print("기호를 입력해주세요: ");
                char operator = sc.next().charAt(0);

                System.out.print("숫자를 입력해주세요: ");
                int number2 = sc.nextInt();

                //계산을 위해 계산기를 생성한다.
                Calculator cal = new Calculator();
                //계산기에게 계산을 시킨다.
                cal.operate(number1, number2, operator);
            }
            catch (Exception e) {
                System.out.println("입력 오류가 발생했습니다. 숫자를 정확히 입력해주세요.");
                sc.nextLine(); // 버퍼 비우기
            }

            System.out.print("계속하시겠습니까? (종료하려면 'exit' 입력, 계속하려면 아무 키나 입력): ");
            command = sc.next();
        } while (!command.equalsIgnoreCase("exit")); // 대소문자 구분 없이 exit 처리

        System.out.println("계산기를 종료합니다.");
        sc.close();

    }
}
