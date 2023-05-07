package com.rolandsall.inventory.command.core.application.product;

import com.rolandsall.inventory.command.core.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCommandHandler implements IProductCommandHandler {

    private final IProductWriteManager productWriteManager;
    private final ProductIdGenerator productIdGenerator;

    @Override
    public void addProduct(AddProductCommand command) {
        Product product = buildProductFromCommand(command);
        productWriteManager.addProduct(product);
    }

    private Product buildProductFromCommand(AddProductCommand command) {
        return Product.builder()
                .id(productIdGenerator.generateId())
                .description(command.getDescription())
                .name(command.getName())
                .quantity(command.getQuantity())
                .build();
    }
}
