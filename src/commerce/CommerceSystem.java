package commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    //main에서 관리 하던걸 이제 여기에서 관리 할 예정
    List<Product> products;
    Scanner sc = new Scanner(System.in);
    //생성자: 사장님이 준 걸 받아서 내 장부(this.products)에 저장!
    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    public void start()  {
        // 4. 가게 문 오픈 (무한 반복 시작)
        while (true) {
            System.out.println("=== 상품 목록 ===");

            // 5. 진열된 상품 하나씩 보여주기 (향상된 for문)
            int i = 1;
            for (Product product : products) {


                // [해결책] 순서를 바꿈: 이름 -> 가격 -> 재고 -> 설명(맨 뒤로!)
                // %-20s: 20칸 확보하고 왼쪽 정렬
                // %,d: 숫자에 3자리마다 콤마(,) 찍어줌 (꿀팁!)
                //이부분은 AI의 도움으로 정렬하는법을 printf로 만들었습니다.
                System.out.printf("%-4d | %-20s | %-12d원 | %-5d개 | %s\n", i++,  product.name, product.price, product.stock, product.explain);
            }

            // 6. 안내 메시지 및 입력
            System.out.println("\0을 누르면 종료: ");
            int input = sc.nextInt();


            // 7. 종료 조건 (비상구)
            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;

            }
            else if (input > 0 && input <= products.size()) {
                // [해석] 0보다 크고, 상품 개수(size)보다 작거나 같은 숫자를 눌렀다면? (유효한 번호라면?)

                // 1. 사람이 누른 번호(1)를 컴퓨터 번호(0)로 변환! (빼기 1 중요!)
                int index = input - 1;

                // 2. 가방에서 해당 번호의 상품 꺼내기
                Product selectedProduct = products.get(index);

                // 3. 상세 내용 보여주기
                System.out.println("\n 선택하신 상품의 상세 정보입니다!");
                System.out.println("=====================================");
                System.out.println("이  름 : " + selectedProduct.name);
                System.out.println("가  격 : " + selectedProduct.price + "원");
                System.out.println("재  고 : " + selectedProduct.stock + "개");
                System.out.println("설  명 : " + selectedProduct.explain);
                System.out.println("=====================================");

            }
            else {
                // 1, 2, 3, 4 도 아니고 0도 아닌 엉뚱한 숫자를 눌렀을 때
                System.out.println(" 없는 번호입니다. 다시 입력해주세요.");
            }
        }
    }

}
