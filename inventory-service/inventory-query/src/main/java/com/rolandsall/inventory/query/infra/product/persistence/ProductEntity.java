package com.rolandsall.inventory.query.infra.product.persistence;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private String description;
    private int quantity;

}
