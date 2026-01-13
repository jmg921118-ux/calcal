package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요 계산기입니다.");
        Scanner sc = new Scanner(System.in);
        String command = "";

        do {
            try {
                System.out.println("숫자를 입력해주세요");
                int number1 = sc.nextInt();

                System.out.println("기호를 입력해주세요");
                char operator = sc.next().charAt(0);

                System.out.println("숫자를 입력해주세요");
                int number2 = sc.nextInt();

                if (operator == '+') {
                    System.out.println("결과값입니다. = " + (number1 + number2));
                } else if (operator == '*') {
                    System.out.println("결과값입니다. = " + (number1 * number2));
                } else if (operator == '-') {
                    System.out.println("결과값입니다. = " + (number1 - number2));
                } else if (operator == '/') {
                    try {
                        int result = number1 / number2;
                        System.out.println("결과값입니다. = " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("0으로 나눌 수 없습니다!.");
                    }
                } else {
                    System.out.println("지원하지 않는 연산자입니다.");
                }
            } catch (Exception e) {
                System.out.println("입력 오류가 발생했습니다. 숫자를 정확히 입력해주세요.");
                sc.nextLine(); // 버퍼 비우기
            }

            System.out.println("계속하시겠습니까? (종료하려면 'exit' 입력, 계속하려면 아무 키나 입력)");
            command = sc.next();

        } while (!command.equalsIgnoreCase("exit")); // 대소문자 구분 없이 exit 처리

        System.out.println("계산기를 종료합니다.");
        sc.close();
    } // main 메서드 끝
} // Main 클래스 끝