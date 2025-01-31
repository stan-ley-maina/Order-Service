package com.example.demo.Client;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.logging.Logger;

@Component
public interface InventoryClient {

    // This method will interact with the external inventory API
   //@CircuitBreaker(name = "inventory", fallbackMethod = "fallbackMethod")
   //@Retry(name = "inventory")
   @GetExchange("/api/inventory")
    boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity);

    // The fallback method to be invoked when the circuit is open or retries fail
    //default boolean fallbackMethod(String skuCode, Integer quantity, Throwable throwable) {
        // Log the failure and return a default response (e.g., assume out of stock)
       //System.out.println("Fallback triggered for SKU: " + skuCode + " and Quantity: " + quantity);
        //return false;
    //}
}







