package com.rolandsall.inventory.command.core.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private String id;
    private String name;
    private String description;
    private int quantity;

}
