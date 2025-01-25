package com.example.demo.Client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.logging.Logger;

@Component
@Slf4j
public interface InventoryClient {


    @GetExchange("/api/inventory")
    @CircuitBreaker(name="inventory", fallbackMethod="fallbackMethod")
    @Retry(name="inventory")
    boolean isInStock(@RequestParam String skuCode,@RequestParam Integer quantity);

    default  boolean fallbackMethod(String code,Integer quantity, Throwable throwable){

    }




}
