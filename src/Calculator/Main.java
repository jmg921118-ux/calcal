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
       int sum = (number1 + number2);
       int multi = (number1 * number2);
       int minus = (number1 - number2);
       System.out.println("결과값입니다. = " + sum);
       System.out.println("결과값입니다. = " + minus);
       System.out.println("결과값입니다. = " + multi);
        if (operator == '+') {

        } else if (operator == '*') {

        }
            else if (operator == '-') {

        }

        }
   }






