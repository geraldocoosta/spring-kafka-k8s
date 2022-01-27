package com.example.democonsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("spring-producer-service.spring-producer")
public interface FeignProducerService {

	@PostMapping("/v1/{teste}")
    void postSimplesTeste(@PathVariable String teste);
}
