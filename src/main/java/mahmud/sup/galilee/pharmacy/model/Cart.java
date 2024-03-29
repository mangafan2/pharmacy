package mahmud.sup.galilee.pharmacy.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Long id;
    private Map<Long, Integer> products = new HashMap<>();

    public Cart() {}

    public Cart(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Long, Integer> getProducts() {
        return products;
    }

    public void setProducts(Map<Long, Integer> products) {
        this.products = products;
    }

    public void addProduct(Long productId, Integer quantity) {
        products.merge(productId, quantity, Integer::sum);
    }

    public void removeProduct(Long productId) {
        products.remove(productId);
    }
}
