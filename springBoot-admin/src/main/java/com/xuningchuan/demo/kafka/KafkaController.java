package com.xuningchuan.demo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuningchuan
 * @Title: KafkaController
 * @Description:
 * @date 2019/9/24上午10:22
 */
@RestController
public class KafkaController {

    private static Logger logger = LoggerFactory.getLogger(KafkaController.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/kafka")
    public String sendKafkaMsg(){
        for(int i = 0; i< 10; i++){
            kafkaTemplate.send("first", "key" + i, "hello kafka" + i);
        }
        return "kafka send message successful";
    }

    @KafkaListener(topics = "first")
    public void receive(ConsumerRecord<?, ?> consumer) {
        logger.info("{}---{}:{}", consumer.topic(), consumer.key(), consumer.value());
    }
}
