package sit.int202.classicmodelsfri;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import sit.int202.classicmodelsfri.entities.Product;
import sit.int202.classicmodelsfri.repositories.ProductRepository;

import java.util.List;

public class TestProductJpa {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();
        int page = 1;
        while (true) {
            List<Product> productList = productRepository.findAll(page, 20);
            if (productList.isEmpty()) {
                break;
            }
            page++;
            productList.forEach(p -> System.out.printf("%4s %s\n",
                    p.getProductCode(), p.getProductName()));
            System.out.println("---------------");
        }
    }
}
