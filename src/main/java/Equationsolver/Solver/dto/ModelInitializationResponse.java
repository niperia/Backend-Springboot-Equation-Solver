package Equationsolver.Solver.dto;


import java.util.List;

public class ModelInitializationResponse {
    private String status;
    private Data data;

    public static class Data {
        private String status;
        private String message;
        private Details details;

        public static class Details {
            private String equationType;
            private List<Integer> layers;

            // Getters and setters
            public String getEquationType() {
                return equationType;
            }

            public void setEquationType(String equationType) {
                this.equationType = equationType;
            }

            public List<Integer> getLayers() {
                return layers;
            }

            public void setLayers(List<Integer> layers) {
                this.layers = layers;
            }
        }

        // Getters and setters
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Details getDetails() {
            return details;
        }

        public void setDetails(Details details) {
            this.details = details;
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
