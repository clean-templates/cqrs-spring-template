package com.rolandsall.inventory.query.infra.product.persistence;

import com.rolandsall.inventory.query.core.application.product.IProductReadManager;
import com.rolandsall.inventory.query.core.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductWriteManager implements IProductReadManager {

    private final ProductJpaRepository productJpaRepository;


    @Override
    public List<Product> findAll() {
        List<ProductEntity> productList = productJpaRepository.findAll();
        return mapToProductDomain(productList);
    }

    private List<Product> mapToProductDomain(List<ProductEntity> productList) {
        return productList.stream().map(productEntity -> Product.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .description(productEntity.getDescription())
                .quantity(productEntity.getQuantity())
                .build()
        ).collect(Collectors.toList());
    }
}
