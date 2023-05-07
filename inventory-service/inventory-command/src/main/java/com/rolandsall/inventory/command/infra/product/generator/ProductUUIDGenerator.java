package com.rolandsall.inventory.command.infra.product.generator;

import com.rolandsall.inventory.command.core.application.product.ProductIdGenerator;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductUUIDGenerator implements ProductIdGenerator {
    @Override
    public String generateId() {
        return UUID.randomUUID().toString();
    }
}
