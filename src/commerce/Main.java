package commerce;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. 장바구니(List) 준비
        List<Product> products = new ArrayList<>();



        // 3. 상품 진열하기 (.add) -> 가게 문 열기 전에 미리 채워놔야 함!
        products.add(new Product("Galaxy S25", "최신 안드로이드 스마트폰", 1200000, 55));
        products.add(new Product("iPhone 16", "Apple의 최신 스마트폰", 13500000, 32));
        products.add(new Product("MacBook Pro", "M3 칩셋이 탑재된 노트북", 2400000, 150));
        products.add(new Product("AirPods Pro", "노이즈 캔슬링 무선 이어폰", 350000, 110));

        CommerceSystem cs = new CommerceSystem(products);

        cs.start();


    }


}
