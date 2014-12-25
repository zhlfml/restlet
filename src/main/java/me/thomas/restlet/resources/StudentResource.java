package me.thomas.restlet.resources;

import me.thomas.restlet.entity.Status;
import me.thomas.restlet.entity.Student;
import org.restlet.resource.*;

/**
 * Created by thomas on 12/24/14.
 */
public class StudentResource extends ServerResource {

    @Get
    public Student getStudent() {
        int id = Integer.parseInt((String) getRequestAttributes().get("id"));
        return ResourceHelper.findStudent(id);
    }

    @Put
    public Status updateStudent(Student student) {
        int id = Integer.parseInt((String) getRequestAttributes().get("id"));
        student.setId(id);
        ResourceHelper.saveOrUpdateStudent(student);
        return Status.SUCCESS;
    }

    @Delete
    public Status deleteStudent() {
        int id = Integer.parseInt((String) getRequestAttributes().get("id"));
        ResourceHelper.deleteStudent(id);
        return Status.SUCCESS;
    }
}
