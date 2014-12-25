package me.thomas.restlet.resources;

import me.thomas.restlet.entity.Student;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

/**
 * Created by thomas on 12/24/14.
 */
public class StudentResource extends ServerResource {

    @Get
    public Student getStudent() {
        int id = Integer.parseInt((String) getRequestAttributes().get("studentId"));
        return ResourceHelper.findStudent(id);
    }
}
