package com.rolandsall.inventory.command.core.application.product;

import com.rolandsall.inventory.command.core.application.product.event.EventPublisher;
import com.rolandsall.inventory.command.core.domain.entities.Product;
import com.rolandsall.inventory.command.core.domain.events.ProductEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCommandHandler implements IProductCommandHandler {

    private final IProductWriteManager productWriteManager;
    private final ProductIdGenerator productIdGenerator;
    private final EventPublisher eventPublisher;

    @Override
    public void addProduct(AddProductCommand command) {
        Product product = buildProductFromCommand(command);
        productWriteManager.addProduct(product);
        eventPublisher.publish("products", ProductEvent.builder().type("ProductCreated").product(product).build());
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
