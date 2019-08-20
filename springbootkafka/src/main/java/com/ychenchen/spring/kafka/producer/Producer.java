package com.ychenchen.spring.kafka.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-08-20 10:50
 * @copyright www.ychenchen.com
 */
@Component
public class Producer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    private static Gson gson = new GsonBuilder().create();

    public void send() {
        Message message = new Message();
        message.setId("msg_"+System.currentTimeMillis());
        message.setMsg(UUID.randomUUID().toString());
        message.setSendTime(new Date());
        kafkaTemplate.send("topic1", gson.toJson(message));
    }

}
