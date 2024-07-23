package Model;

public class BasicOperation {

    private String operation;
    private String result;
    private String operationWithResult;

    public BasicOperation() {
    }
    public BasicOperation(String operation, String result, String operationWithResult) {
        this.operation = operation;
        this.result = result;
        this.operationWithResult = operationWithResult;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getOperationWithResult() {
        return operationWithResult;
    }

    public void setOperationWithResult(String operationWithResult) {
        this.operationWithResult = operationWithResult;
    }
}
