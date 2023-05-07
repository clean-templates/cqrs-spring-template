package com.rolandsall.inventory.query.core.application.product;

import com.rolandsall.inventory.query.core.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductQueryHandler implements IProductQueryHandler {

    private final IProductReadManager productReadManager;

    @Override
    public List<Product> findAll() {
        return productReadManager.findAll();
    }
}
