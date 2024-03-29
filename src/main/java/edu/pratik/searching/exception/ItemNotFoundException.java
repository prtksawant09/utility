package edu.pratik.searching.exception;

public class ItemNotFoundException extends Exception {
    String customMessage;
    public ItemNotFoundException(int n) {
        super("Element "+n+" not found in array");
        setCustomMessage("Element "+n+" not found in array");
    }

    public String getCustomMessage() {
        return this.customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public void printErrorMessage() {
        System.out.println(getCustomMessage());
    }
}
