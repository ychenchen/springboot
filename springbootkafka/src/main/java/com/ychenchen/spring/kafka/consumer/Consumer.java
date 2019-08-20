package com.ychenchen.spring.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-08-20 10:21
 * @copyright www.ychenchen.com
 */
@Component
public class Consumer {

    @KafkaListener(topics = { "topic1"})
    public void listen(ConsumerRecord<?, ?> record) {
        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("record: "+record);
            System.out.println("message: "+message);
        }
    }

}
