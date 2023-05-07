package com.rolandsall.inventory.query.core.application.product;

import com.rolandsall.inventory.query.core.domain.Product;

import java.util.List;

public interface IProductQueryHandler {

    List<Product> findAll();
}
