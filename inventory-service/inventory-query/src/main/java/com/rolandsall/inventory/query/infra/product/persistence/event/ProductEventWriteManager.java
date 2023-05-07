package com.rolandsall.inventory.query.infra.product.persistence.event;

import com.rolandsall.inventory.query.core.application.product.event.IProductWriteManager;
import com.rolandsall.inventory.query.core.domain.Product;
import com.rolandsall.inventory.query.infra.product.persistence.ProductEntity;
import com.rolandsall.inventory.query.infra.product.persistence.ProductJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductEventWriteManager implements IProductWriteManager {

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
