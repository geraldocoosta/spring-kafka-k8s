package com.example.demokafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class TesteService {


    private static final String BOOT_TOPIC = "teste";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void mandaMensagemKafka(String teste) {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(BOOT_TOPIC, teste);

        future.addCallback(result -> {
            long offset = 0;
            if (result != null) {
                offset = result.getRecordMetadata().offset();
            }
            log.info("Sent message=[ {} ] with offset=[ {} ]", teste, String.valueOf(offset));
        }, ex -> log.info("Unable to send message=["+ teste + "] due to : " + ex.getMessage(), ex));
    }
}
