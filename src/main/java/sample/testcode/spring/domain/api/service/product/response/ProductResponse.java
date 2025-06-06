package sample.testcode.spring.domain.api.service.product.response;

import jakarta.persistence.*;
import lombok.Builder;
import sample.testcode.spring.domain.product.Product;
import sample.testcode.spring.domain.product.ProductSellingType;
import sample.testcode.spring.domain.product.ProductType;

public class ProductResponse {

    private Long id;
    private String productNumber;
    private ProductType productType;
    private ProductSellingType productSellingType;
    private String name;
    private int price;

    @Builder
    public ProductResponse(Long id, String productNumber, ProductType productType, ProductSellingType productSellingType, String name, int price) {
        this.id = id;
        this.productNumber = productNumber;
        this.productType = productType;
        this.productSellingType = productSellingType;
        this.name = name;
        this.price = price;
    }

    public static ProductResponse of(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .productNumber(product.getProductNumber())
                .productType(product.getProductType())
                .productSellingType(product.getProductSellingType())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
