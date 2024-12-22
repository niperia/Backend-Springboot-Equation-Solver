package Equationsolver.Solver.dto;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SolveEquationResponse {

    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    private Data data;

    // Getters and setters for status and data

    public static class Data {
        @JsonProperty("status")
        private String status;
        @JsonProperty("losses")
        private double[] losses;
        @JsonProperty("solution")
        private Solution solution;
        // Getters and setters for status, losses, and solution


        public static class Solution {
            @JsonProperty("x")
            private double[] x;
            @JsonProperty("y")
            private double[] y; // Adapt for PDE case with multiple arrays
            //Getters and setters for x and y (and potentially others for PDE)
        }
    }
}