package Equationsolver.Solver.dto;

import Equationsolver.Solver.model.EquationType;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;


import com.fasterxml.jackson.annotation.JsonProperty;

public class InitializeModelResponse {

    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    private Data data;

    // Getters and setters for 'status' and 'data'

    public static class Data {
        @JsonProperty("status")
        private String status;
        @JsonProperty("message")
        private String message;
        @JsonProperty("details")
        private Details details;

        // Getters and setters for 'status', 'message', and 'details'

        public static class Details {
            @JsonProperty("equation_type")
            private EquationType equationType;
            @JsonProperty("layers")
            private int[] layers;
            // Getters and setters for 'equationType' and 'layers'
        }
    }
}