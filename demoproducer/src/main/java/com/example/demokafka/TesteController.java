package com.example.demokafka;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class TesteController {

    private final TesteService testeService;

    @PostMapping("/{teste}")
    public ResponseEntity<Void> teste (@PathVariable String teste) {
        testeService.mandaMensagemKafka(teste);
        return ResponseEntity.ok().build();
    }

}
