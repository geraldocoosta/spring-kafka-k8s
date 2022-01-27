package com.example.democonsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@EnableFeignClients
@RequestMapping("/v1")
@RestController
@SpringBootApplication
@RequiredArgsConstructor
@EnableDiscoveryClient
public class DemoconsumerApplication {

	private final FeignProducerService chamandoProducer;
	
	@GetMapping
	public ResponseEntity<Void> testeChamadaFeign() {
		chamandoProducer.postSimplesTeste("teste");
		return ResponseEntity.ok().build();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoconsumerApplication.class, args);
	}

}
