package Equationsolver.Solver.dto;




public class SolveEquationRequest {
    private String equationType;
    private Object domain;
    private int numPoints;
    private int epochs;
    private boolean saveResult;
    private String resultId;

    // Getters and setters
    public String getEquationType() {
        return equationType;
    }

    public void setEquationType(String equationType) {
        this.equationType = equationType;
    }

    public Object getDomain() {
        return domain;
    }

    public void setDomain(Object domain) {
        this.domain = domain;
    }

    public int getNumPoints() {
        return numPoints;
    }

    public void setNumPoints(int numPoints) {
        this.numPoints = numPoints;
    }

    public int getEpochs() {
        return epochs;
    }

    public void setEpochs(int epochs) {
        this.epochs = epochs;
    }

    public boolean isSaveResult() {
        return saveResult;
    }

    public void setSaveResult(boolean saveResult) {
        this.saveResult = saveResult;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }
}
