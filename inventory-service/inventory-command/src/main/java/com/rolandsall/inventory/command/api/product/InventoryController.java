package com.rolandsall.inventory.command.api.product;


import com.rolandsall.inventory.command.core.application.product.AddProductCommand;
import com.rolandsall.inventory.command.core.application.product.IProductCommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class InventoryController {

    private final IProductCommandHandler productCommandHandler;

    @PostMapping("/")
    public ResponseEntity<Void> addProduct(@RequestBody AddProductApiRequest request){
        productCommandHandler.addProduct(createCommandFrom(request));
        return ResponseEntity.noContent().build();
    }

    private AddProductCommand createCommandFrom(AddProductApiRequest request) {
        return AddProductCommand.builder()
                .description(request.getDescription())
                .name(request.getName())
                .quantity(request.getQuantity())
                .build();
    }
}
