package sample.testcode.spring.domain.product;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import sample.testcode.spring.domain.BaseEntity;

@NoArgsConstructor
@Getter
@Entity
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productNumber;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    @Enumerated(EnumType.STRING)
    private ProductSellingStatus productSellingStatus;

    private String name;

    private int price;

    @Builder
    public Product(String productNumber, ProductType productType, ProductSellingStatus productSellingStatus, String name, int price) {
        this.productNumber = productNumber;
        this.productType = productType;
        this.productSellingStatus = productSellingStatus;
        this.name = name;
        this.price = price;
    }
}
