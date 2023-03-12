package edu.pratik.searching.exception;

public class ItemNotFoundException extends Exception {
    String customMessage;
    public ItemNotFoundException(String s) {
        super(s);
        setCustomMessage(s);
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
