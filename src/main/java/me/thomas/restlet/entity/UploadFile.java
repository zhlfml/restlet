package me.thomas.restlet.entity;

/**
 * Created by thomas on 2014/12/26.
 */
public class UploadFile {

    private String fileName;

    public UploadFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
