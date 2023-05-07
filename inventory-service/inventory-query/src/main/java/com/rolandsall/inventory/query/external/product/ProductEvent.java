package com.rolandsall.inventory.query.external.product;

import com.rolandsall.inventory.query.core.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEvent {

    private String type;
    private Product product;
}