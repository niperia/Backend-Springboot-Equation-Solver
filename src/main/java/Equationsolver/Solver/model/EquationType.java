package Equationsolver.Solver.model;

// File: src/main/java/com/example/pinnsolver/model/EquationType.java


public enum EquationType {
    ODE("Ordinary Differential Equation"),
    PDE("Partial Differential Equation");

    private final String description;

    EquationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
