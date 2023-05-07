package com.rolandsall.inventory.command.external.product;

import com.rolandsall.inventory.command.core.application.product.event.EventPublisher;
import com.rolandsall.inventory.command.core.domain.events.ProductEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProductEventPublisher implements EventPublisher {

    private final KafkaTemplate<String, ProductEvent> kafkaTemplate;


    @Override
    public void publish(String topic, Object payload) {
        kafkaTemplate.send(topic, (ProductEvent) payload);
    }
}
