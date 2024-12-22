package Equationsolver.Solver.controller;

import Equationsolver.Solver.dto.*;
import Equationsolver.Solver.service.EquationSolverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/")
public class EquationController {

    @Autowired
    private EquationSolverService equationService;

    @PostMapping("/api/initialize")
    public Mono<ResponseEntity<InitializeModelResponse>> initializeModel(@RequestBody InitializeModelRequest request) {
        return equationService.initializeModel(request)
                .map(ResponseEntity::ok)
                .onErrorResume(error -> Mono.just(ResponseEntity.badRequest().build()));
    }


    @PostMapping("/api/solve")
    public ResponseEntity<SolveEquationResponse> solveEquation(@RequestBody SolveEquationRequest request) {
        return equationService.solveEquation(request)
                .map(ResponseEntity::ok)
                .onErrorResume(error -> Mono.just(ResponseEntity.badRequest().build())).block();
    }

    @GetMapping("/health")
    public Mono<ResponseEntity<String>> healthCheck(){
        return equationService.checkHealth()
                .map(ResponseEntity::ok)
                .onErrorResume(error -> Mono.just(ResponseEntity.status(500).body("Python backend unavailable")));
    }
}