package Equationsolver.Solver.dto;

import java.util.List;




public class SolveEquationResponse {
    private String status;
    private Data data;

    public static class Data {
        private String status;
        private List<Double> losses;
        private Solution solution;

        public static class Solution {
            private List<Double> x;
            private List<Double> y;

            // Getters and setters
            public List<Double> getX() {
                return x;
            }

            public void setX(List<Double> x) {
                this.x = x;
            }

            public List<Double> getY() {
                return y;
            }

            public void setY(List<Double> y) {
                this.y = y;
            }
        }

        // Getters and setters
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<Double> getLosses() {
            return losses;
        }

        public void setLosses(List<Double> losses) {
            this.losses = losses;
        }

        public Solution getSolution() {
            return solution;
        }

        public void setSolution(Solution solution) {
            this.solution = solution;
        }
    }

    // Getters and setters
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
