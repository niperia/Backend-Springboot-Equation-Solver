package Equationsolver.Solver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;


@Configuration
public class WebClientConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl("http://localhost:5000") // Replace with your Python API URL
                .defaultHeader("Content-Type", "application/json")
                .filter((request, next) -> next.exchange(request)
                        .timeout(Duration.ofSeconds(60)) // Set timeout duration as needed
                        .onErrorMap(throwable -> new RuntimeException("Timeout Occurred!"))) // Handle timeout errors
                .build();

    }

}