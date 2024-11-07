package estudos.web.api.handler;

import java.util.Date;

public class ResponseError {
    private final Date timestamp = new Date();
    private String status;
    private int statusCode;
    private String error;

    public ResponseError() {

    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

