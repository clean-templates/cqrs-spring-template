package com.rolandsall.inventory.command.core.domain.events;

import com.rolandsall.inventory.command.core.domain.entities.Product;
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