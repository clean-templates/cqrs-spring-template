package com.rolandsall.inventory.query.external.product;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rolandsall.inventory.query.core.application.product.event.IProductEventHandler;
import com.rolandsall.inventory.query.core.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductEventListener {

    private final IProductEventHandler productEventHandler;


    @KafkaListener(topics = "products", groupId = "products_groups")
    public void processProductEvent(String event) throws JsonProcessingException {
        System.out.println("Getting event " + event);
        ProductEvent productEvent = new ObjectMapper().readValue(event, ProductEvent.class);
        Product product = productEvent.getProduct();
        productEventHandler.updateProductInventory(product);


    }
}
