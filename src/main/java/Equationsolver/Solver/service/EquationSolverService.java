package Equationsolver.Solver.service;

import Equationsolver.Solver.dto.*;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;




import org.springframework.beans.factory.annotation.Autowired;


@Service
public class EquationSolverService {

    private final WebClient webClient;

    @Autowired
    public EquationSolverService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:5000").build(); // Set the base URL once here
    }

    // Call Python API to initialize the model
    public Mono<ModelInitializationResponse> initializeModel(SolveEquationRequest request) {
        String url = "/api/initialize"; // Only the path since base URL is already set

        return webClient.post()
                .uri(url)
                .bodyValue(request)
                .retrieve()
                .bodyToMono(ModelInitializationResponse.class);
    }

    // Call Python API to solve the equation
    public Mono<SolveEquationResponse> solveEquation(SolveEquationRequest request) {
        String url = "/api/solve"; // Only the path

        return webClient.post()
                .uri(url)
                .bodyValue(request)
                .retrieve()
                .bodyToMono(SolveEquationResponse.class);
    }

    // Health Check - To ensure the Python API is up
    public Mono<HealthResponse> healthCheck() {
        String url = "/health"; // Only the path

        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(HealthResponse.class);
    }
}
