package com.example.SpringCloudAdapterAWS;

import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringCloudAdapterAWSApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudAdapterAWSApplication.class, args);
	}

	@Bean
	public Function<ScheduledEvent, ScheduledEvent> sampleFunction() {
		return input -> {
			System.out.println("Received event: " + input);
			return input;
		};
	}
}
