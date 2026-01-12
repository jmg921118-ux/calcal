package Calculator;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int number1 = sc.nextInt();
        System.out.println("기호를 입력해주세요");
        char operator = sc.next().charAt(0);
       System.out.println("숫자를 입력해주세요");
       int number2 = sc.nextInt();








        if (operator == '+') {
            int sum = (number1 + number2); // 더하기 방에 들어왔을 때만 더하기!
            System.out.println("결과값입니다. = " + sum);

        } else if (operator == '*') {
            int multi = (number1 * number2);
            System.out.println("결과값입니다. = " + multi);
        }
            else if (operator == '-') {
            int minus = (number1 - number2);
            System.out.println("결과값입니다. = " + minus);
        }
            else if (operator == '/') {

                try{
                    // [시도] 위험한 계산은 반드시 이 중괄호 안에서 해야 합니다!
                    // (주의: 계산식을 여기 밖에서 미리 써두면, 들어오기 전에 이미 프로그램이 터집니다.)
                    int result = number1 / number2;
                    System.out.println("결과값입니다. = " + result);
                }catch (ArithmeticException e) {
                    int divi = (number1 / number2);
                    // [수습] 0으로 나눠서 에러가 나면, 프로그램이 죽지 않고 바로 여기로 옵니다.
                    System.out.println("0으로 나눌 수 없습니다!.");

                }




        }



        }
   }






