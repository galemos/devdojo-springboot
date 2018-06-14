package br.com.devdojo.awsome.eror;

/**
 * @author Created by glemos on 14/06/2018.
 */

public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
