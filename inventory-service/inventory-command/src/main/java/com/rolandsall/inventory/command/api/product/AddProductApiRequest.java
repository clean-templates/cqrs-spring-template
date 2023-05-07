package com.rolandsall.inventory.command.api.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddProductApiRequest {
    private String name;
    private String description;
    private int quantity;
}

