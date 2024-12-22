package Equationsolver.Solver.dto;

import Equationsolver.Solver.model.EquationType;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class InitializeModelRequest {
    @JsonProperty("layers")
    public int[] layers;
    @JsonProperty("equation_type")
    public EquationType equationType;
    // Add getters and setters
}