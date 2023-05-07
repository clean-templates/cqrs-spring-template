package com.rolandsall.inventory.query.api.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductApiResponse{
    private String id;
    private String name;
    private String description;
    private int quantity;
}

