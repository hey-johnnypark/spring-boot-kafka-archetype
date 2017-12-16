package ${groupId};

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
class App {

  private static final Logger LOG = LoggerFactory.getLogger(App.class);

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @KafkaListener(topics = "${kafka.topic}")
  public void onMessage(ConsumerRecord<String, String> record) {
    LOG.info("Received record: {}", record.value());

    // apply-your-logic-to (record)

  }

}