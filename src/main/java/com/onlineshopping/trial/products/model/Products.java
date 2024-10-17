package com.onlineshopping.trial.products.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private UUID productId;
    @Column
    private String productName;
    @Column
    private UUID categoryId;
    @Column
    private double price;
    @Transient
    private double discountedPrice;
    @Column
    private String description;

    public Products(UUID productId, String productName, UUID categoryId,double price) {
        this.productId= productId;
        this.productName= productName;
        this.categoryId= categoryId;
        this.price=price;

    }

}
