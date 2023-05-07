package com.rolandsall.inventory.command.infra.product.persistence;

import com.rolandsall.inventory.command.core.application.product.IProductWriteManager;
import com.rolandsall.inventory.command.core.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductWriteManager implements IProductWriteManager {

    private final ProductJpaRepository productJpaRepository;

    @Override
    public void addProduct(Product product) {
        ProductEntity productEntity = buildEntityFrom(product);
        productJpaRepository.save(productEntity);
    }

    private ProductEntity buildEntityFrom(Product product) {
        return ProductEntity.builder()
                .description(product.getDescription())
                .quantity(product.getQuantity())
                .id(product.getId())
                .name(product.getName())
                .build();
    }
}
