package me.thomas.restlet.entity;

/**
 * Created by thomas on 12/25/14.
 */
public class Status {

    private boolean success;

    private Status(boolean success) {
        this.success = success;
    }

    public static Status SUCCESS = new Status(true);
    public static Status FAILED = new Status(false);

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
