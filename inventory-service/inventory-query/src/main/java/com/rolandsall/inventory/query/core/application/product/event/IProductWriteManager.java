package com.rolandsall.inventory.query.core.application.product.event;


import com.rolandsall.inventory.query.core.domain.Product;

public interface IProductWriteManager {

    void addProduct(Product product);
}
