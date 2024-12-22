package Equationsolver.Solver.dto;
import Equationsolver.Solver.model.EquationType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SolveEquationRequest {
    @JsonProperty("equation_type")
    public EquationType equationType;
    @JsonProperty("domain")
    public Object domain; // Needs to handle both 1D and 2D domains appropriately (consider using a custom class)
    @JsonProperty("num_points")
    public int numPoints;
    @JsonProperty("epochs")
    public int epochs;
    @JsonProperty("save_result")
    public boolean saveResult;
    @JsonProperty("result_id")
    public String resultId;
    // Add getters and setters
}
