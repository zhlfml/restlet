package me.thomas.restlet.resources;

import me.thomas.restlet.entity.Status;
import me.thomas.restlet.entity.Student;
import org.restlet.resource.*;

import java.util.List;

/**
 * Created by thomas on 12/24/14.
 */
public class StudentsResource extends ServerResource {

    @Get
    public List<Student> getStudents() {
        return ResourceHelper.findAll();
    }

    @Post
    public Status saveStudent(Student student) {
        student.setId(ResourceHelper.UUID++);
        ResourceHelper.saveOrUpdateStudent(student);
        return Status.SUCCESS;
    }

}
