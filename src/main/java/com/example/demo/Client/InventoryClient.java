package com.example.demo.Client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

@Component
public interface InventoryClient {


    @GetExchange("/api/inventory")
    boolean isInStock(@RequestParam String skuCode,@RequestParam Integer quantity);
}
