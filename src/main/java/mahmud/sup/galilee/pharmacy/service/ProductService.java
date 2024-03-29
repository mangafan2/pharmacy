package mahmud.sup.galilee.pharmacy.service;

import mahmud.sup.galilee.pharmacy.model.Product;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final Map<Long, Product> products = new HashMap<>();
    private long productIdSequence = 0L;

    public Product addProduct(Product product) {
        product.setId(++productIdSequence);
        products.put(product.getId(), product);
        return product;
    }
    public List<Product> getAllProducts() {
        return products.values().stream().collect(Collectors.toList());
    }
}

