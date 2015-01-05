package me.thomas.restlet.client;

import me.thomas.restlet.entity.Student;
import org.restlet.resource.ClientResource;

/**
 * Created by thomas on 12/27/14.
 */
public class StudentsClient {

    public static void main(String[] args) throws Exception {
        ClientResource client = new ClientResource("http://localhost:8080/restlet/rest/students");
        Student student = new Student();
        student.setName("Celine");
        student.setGender("Women");
        student.setAge(26);
        client.post(student);
    }
}
