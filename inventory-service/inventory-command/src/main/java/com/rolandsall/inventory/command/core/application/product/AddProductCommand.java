package com.rolandsall.inventory.command.core.application.product;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddProductCommand {
    private String name;
    private String description;
    private int quantity;
}
