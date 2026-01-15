package Cal2;

import java.util.ArrayList; // 1. ArrayList를 쓰기 위해 가져옵니다.
import java.util.List;

public class Calculator {

    // 연산 결과를 저장하는 필드입니다.
    // private을 붙여서 외부(Main)에서 함부로 손대지 못하게 막는다.
    private List<Integer> results = new ArrayList<>();

    // [기능: 연산 수행]
    // 리턴 타입을 int로 변경하여 계산된 값을 Main으로 돌려줍니다.
    public int calculate(int number1, int number2, char operator) {
        int result = 0;

        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
        } else if (operator == '/') {
            if (number2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return 0; // 에러 시 0 반환 (혹은 예외 던지기)
            }
            result = number1 / number2;
        } else {
            System.out.println("지원하지 않는 연산자입니다.");
            return 0;
        }

        // 계산이 끝나면 결과를 리스트에 적어둡니다.
        results.add(result);

        return result;
    }

    // private으로 잠긴 results를 외부에서 '읽을 수만' 있게 해줍니다.
    public List<Integer> getResults() {
        return results;
    }

    // 외부에서 새로운 리스트로 통째로 바꾸고 싶을 때 사용합니다.
    public void setResults(List<Integer> results) {
        this.results = results;
    }

    // 오래된 기록(0번째 인덱스)을 지웁니다.
    public void removeFirstResult() {
        if (!results.isEmpty()) { // 리스트가 비어있지 않다면
            results.remove(0); // 0번방(가장 먼저 들어온 것) 삭제
            System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 기록이 없습니다.");
        }
    }
}