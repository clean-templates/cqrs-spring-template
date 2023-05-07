package com.rolandsall.inventory.query.api.product;


import com.rolandsall.inventory.query.core.application.product.IProductQueryHandler;
import com.rolandsall.inventory.query.core.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class InventoryController {

    private final IProductQueryHandler productQueryHandler;

    @GetMapping("/")
    public ResponseEntity<List<ProductApiResponse>> findAll(){
        List<Product> listOfProducts = productQueryHandler.findAll();
        List<ProductApiResponse> productApiResponses = mapToApiResponse(listOfProducts);
        return ResponseEntity.ok().body(productApiResponses);
    }

    private List<ProductApiResponse> mapToApiResponse(List<Product> productList) {
        return productList.stream().map(productEntity -> ProductApiResponse.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .description(productEntity.getDescription())
                .quantity(productEntity.getQuantity())
                .build()
        ).collect(Collectors.toList());
    }
}
