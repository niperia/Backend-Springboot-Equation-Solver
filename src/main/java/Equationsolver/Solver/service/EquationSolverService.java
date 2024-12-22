package Equationsolver.Solver.service;

import Equationsolver.Solver.dto.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class EquationSolverService {

    @Autowired
    private WebClient webClient;


    public Mono<InitializeModelResponse> initializeModel(InitializeModelRequest request) {
        return webClient.post()
                .uri("/api/initialize")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(request), InitializeModelRequest.class)
                .retrieve()
                .bodyToMono(InitializeModelResponse.class);
    }

    public Mono<SolveEquationResponse> solveEquation(SolveEquationRequest request) {
        return webClient.post()
                .uri("/api/solve")
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(request), SolveEquationRequest.class)
                .retrieve()
                .bodyToMono(SolveEquationResponse.class)
                .timeout(Duration.ofSeconds(120)) // Timeout duration of 60 seconds
                .onErrorMap(throwable -> new RuntimeException("Timeout or other error occurred", throwable)); // Handle timeout or other errors
    }

    // Add a method for /health endpoint
    public Mono<String> checkHealth(){
        return webClient.get()
                .uri("/health")
                .retrieve()
                .bodyToMono(String.class);
    }
}