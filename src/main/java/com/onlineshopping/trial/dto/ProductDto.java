package com.onlineshopping.trial.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ProductDto {
    private UUID productId;
    private String productName;
    private UUID categoryId;
    private double price;
    private double discountedPrice;
    private String description;


}
