package commerce;

public class Product {

    // 1. 상품의 속성 (재료 준비)
    String name;    // 상품명
    String explain; // 설명
    int price;      // 가격
    int stock;      // 재고

    // 2. 생성자 (주문서: new 할 때 데이터를 한 번에 넣기 위함)
    public Product(String name, String explain, int price, int stock) {
        this.name = name;
        this.explain = explain;
        this.price = price;
        this.stock = stock;

    }
}

