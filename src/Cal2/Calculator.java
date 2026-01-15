package Cal2;

import java.lang.runtime.SwitchBootstraps;

public class Calculator {

    // Class는 설계도 계산기가 할 수 있는 일들을 기능으로 만든다.
    // 기능 = method
    int operate(int number1, int number2, char operator)
    {
        int result = 0;
        if (operator == '+') {
            System.out.println("결과값입니다. = " + (number1 + number2));
        } else if (operator == '*') {
            System.out.println("결과값입니다. = " + (number1 * number2));
        } else if (operator == '-') {
            System.out.println("결과값입니다. = " + (number1 - number2));
        } else if (operator == '/') {
            try {
                 result = number1 / number2;
                System.out.println("결과값입니다. = " + result);
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다!.");
            }
        } else {
            System.out.println("지원하지 않는 연산자입니다.");

        }
        return result;

    }

}