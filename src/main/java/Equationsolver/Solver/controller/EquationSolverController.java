package Equationsolver.Solver.controller;

import Equationsolver.Solver.dto.HealthResponse;
import Equationsolver.Solver.dto.ModelInitializationResponse;
import Equationsolver.Solver.dto.SolveEquationResponse;
import Equationsolver.Solver.dto.SolveEquationRequest;
import Equationsolver.Solver.service.EquationSolverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api/equation")
public class EquationSolverController {

    private final EquationSolverService equationSolverService;

    @Autowired
    public EquationSolverController(EquationSolverService equationSolverService) {
        this.equationSolverService = equationSolverService;
    }

    @PostMapping("/initialize")
    public ModelInitializationResponse initializeModel(@RequestBody SolveEquationRequest request) {
        return equationSolverService.initializeModel(request).block(); // Assuming you use .block() in this context, as it returns Mono
    }
    @PostMapping("/solve")
    public Mono<SolveEquationResponse> solveEquation(@RequestBody SolveEquationRequest request) {
        return equationSolverService.solveEquation(request);
    }
    @GetMapping("/health")
    public Mono<HealthResponse> checkHealth() {
        return equationSolverService.healthCheck();
    }
}
