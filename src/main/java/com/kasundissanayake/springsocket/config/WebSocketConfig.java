package com.kasundissanayake.springsocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/websocket-example")
                .withSockJS();

    }
    //Override the default message broker (the broker name which we wanted
    // )

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) { //Broker information
        registry.enableSimpleBroker("topic"); // push the message
        registry.setApplicationDestinationPrefixes("/app");

    }
}
