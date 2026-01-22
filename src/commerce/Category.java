package commerce;

import java.util.List;

public class Category {
    private List<Product> products;

    private String categoryName;

     public Category(String categoryName, List<Product> products) {
        this.categoryName = categoryName;
        this.products = products;


     }

    public List<Product> getProducts() {
        return this.products;
    }
        public String getCategoryName() {
            return this.categoryName;
    }

}

