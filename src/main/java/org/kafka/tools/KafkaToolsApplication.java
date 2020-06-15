package org.kafka.tools;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.ListTopicsOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class KafkaToolsApplication {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		SpringApplication.run(KafkaToolsApplication.class, args);

	}

}
