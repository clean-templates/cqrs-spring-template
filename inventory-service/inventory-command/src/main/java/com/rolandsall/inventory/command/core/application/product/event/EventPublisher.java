package com.rolandsall.inventory.command.core.application.product.event;

public interface EventPublisher {

    void publish(String topic, Object payload);
}
