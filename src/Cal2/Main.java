package Cal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // [중요 수정!] 반복문 '밖'에서 계산기를 생성해야 한다.
        Calculator cal = new Calculator();

        String command = "";

        do {
            try {
                System.out.println("--- 계산기 실행 ---");
                System.out.print("첫 번째 숫자를 입력해주세요: ");
                int number1 = sc.nextInt();

                System.out.print("기호를 입력해주세요 (+,-,*,/): ");
                char operator = sc.next().charAt(0);

                System.out.print("두 번째 숫자를 입력해주세요: ");
                int number2 = sc.nextInt();

                // 1. 계산기에게 계산을 시키고, 결과를 받습니다.
                int result = cal.calculate(number1, number2, operator);
                System.out.println("결과값: " + result);

                // 2. 현재까지 저장된 기록을 확인한다 (Getter 활용)
                // cal.results 처럼 직접 접근은 불가능하고, getResults()를 써야 합니다.
                System.out.println("현재 저장된 모든 기록: " + cal.getResults());

            } catch (Exception e) {
                System.out.println("입력 오류! 숫자를 정확히 입력해주세요.");
                sc.nextLine(); // 버퍼 비우기
            }

            System.out.println("-------------------------");
            System.out.println("1. 계속 계산하기 (아무 키나 입력)");
            System.out.println("2. 가장 오래된 기록 삭제 (remove 입력)");
            System.out.println("3. 종료 (exit 입력)");
            System.out.print("선택: ");
            command = sc.next();

            if (command.equalsIgnoreCase("remove")) {
                cal.removeFirstResult();
            }

        } while (!command.equalsIgnoreCase("exit"));

        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}