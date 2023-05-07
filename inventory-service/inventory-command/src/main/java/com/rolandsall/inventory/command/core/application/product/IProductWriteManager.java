package com.rolandsall.inventory.command.core.application.product;

import com.rolandsall.inventory.command.core.domain.entities.Product;

public interface IProductWriteManager {

    void addProduct(Product product);
}
