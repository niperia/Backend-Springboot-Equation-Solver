package Equationsolver.Solver.dto;



import java.util.List;

public class ModelInitializationRequest {
    private List<Integer> layers;
    private String equationType;

    // Getters and setters
    public List<Integer> getLayers() {
        return layers;
    }

    public void setLayers(List<Integer> layers) {
        this.layers = layers;
    }

    public String getEquationType() {
        return equationType;
    }

    public void setEquationType(String equationType) {
        this.equationType = equationType;
    }
}
