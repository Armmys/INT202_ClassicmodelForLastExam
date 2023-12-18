package sit.int202.classicmodelsfri.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
@NamedQueries({
        @NamedQuery(name = "PRODUCT.FIND_ALL",
                query = "select p from Product p"),
        @NamedQuery(name = "PRODUCT.COUNT",
                query = "select count(p) as count from Product p")
})

public class Product {
    @Id
    private String productCode;
    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private Integer quantityInStock;
    private Double buyPrice;
    @Column(name = "MSRP")
    private Double price;
}
