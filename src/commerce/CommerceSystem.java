package commerce;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {
    // 이제 낱개가 아니라 '카테고리 묶음(책장)'을 가지고 있습니다.
    private List<Category> categories;
    Scanner sc = new Scanner(System.in);

    // 생성자: 사장님(Main)이 준 카테고리 묶음을 받습니다.
    public CommerceSystem(List<Category> categories) {
        this.categories = categories;
    }

    public void start() {
        while (true) {
            // 1. 먼저 카테고리(책)들을 보여줍니다.
            System.out.println("\n=== 카테고리 목록 ===");
            for (int i = 0; i < categories.size(); i++) {
                // 책장에서 책을 한 권 꺼내서(.get), 이름표를 읽습니다(.getCategoryName)
                System.out.println((i + 1) + ". " + categories.get(i).getCategoryName());
            }

            System.out.println("0. 종료");
            System.out.print("원하는 카테고리 번호를 입력하세요: ");
            int catInput = sc.nextInt();

            // 종료 조건
            if (catInput == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 잘못된 번호를 눌렀을 때
            if (catInput < 1 || catInput > categories.size()) {
                System.out.println("없는 번호입니다. 다시 입력해주세요.");
                continue; // 다시 위로 돌아가기
            }

            // 2. 선택한 카테고리(책)를 책장에서 꺼냅니다!
            Category selectedCategory = categories.get(catInput - 1);

            // 3. 이제 그 책 안에 있는 상품들(products)을 호출한다
            // 여기서 selectedCategory.getProducts()를 쓴다
            List<Product> productList = selectedCategory.getProducts();

            System.out.println("\n=== " + selectedCategory.getCategoryName() + " 상품 목록 ===");

            // 상품 보여주기
            int i = 1;
            for (Product product : productList) {
                System.out.printf("%-4d | %-20s | %,d원 | %d개 | %s\n",
                        i++, product.getName(), product.getPrice(), product.getStock(), product.getExplain());
            }

        }
    }
}