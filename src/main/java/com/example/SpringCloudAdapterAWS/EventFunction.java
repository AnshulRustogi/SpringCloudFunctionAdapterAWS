package com.example.SpringCloudAdapterAWS;

import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class EventFunction {

    @Bean
    public Function<ScheduledEvent, ScheduledEvent> question() {
        return input -> {
            System.out.println("Received event: " + input);
            return input;
        };
    }
}
