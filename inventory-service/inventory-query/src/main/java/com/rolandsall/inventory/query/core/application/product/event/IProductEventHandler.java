package com.rolandsall.inventory.query.core.application.product.event;

import com.rolandsall.inventory.query.core.domain.Product;

public interface IProductEventHandler{

    void updateProductInventory(Product product);
}