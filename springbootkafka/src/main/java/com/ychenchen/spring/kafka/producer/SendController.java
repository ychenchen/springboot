package com.ychenchen.spring.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alexis.Yang
 * @descriptioin
 * @date 2019-08-20 10:57
 * @copyright www.ychenchen.com
 */
@RestController
@RequestMapping("/kafkaSender")
public class SendController {
    @Autowired
    private Producer producer;

    @RequestMapping(value = "/send")
    public String send() {
        producer.send();
        return "{\"code\":0}";
    }
}
