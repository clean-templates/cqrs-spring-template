package com.rolandsall.inventory.query.core.application.product.event;

import com.rolandsall.inventory.query.core.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductEventHandler implements IProductEventHandler{

    private final IProductWriteManager productWriteManager;

    @Override
    public void updateProductInventory(Product product) {
        productWriteManager.addProduct(product);
    }
}
