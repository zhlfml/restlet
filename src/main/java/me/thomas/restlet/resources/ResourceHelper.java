package me.thomas.restlet.resources;

import me.thomas.restlet.entity.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by thomas on 12/24/14.
 */
public class ResourceHelper {

    static Map<Integer, Student> map = new HashMap<Integer, Student>();
    static {
        Student student = new Student();
        student.setId(1);
        student.setName("Thomas");
        student.setGender("M");
        student.setAge(28);

        map.put(student.getId(), student);
    }

    static Student findStudent(int id) {
        return map.get(id);
    }

    static void saveOrUpdateStudent(Student student) {
        map.put(student.getId(), student);
    }

    static void deleteStudent(int id) {
        map.remove(id);
    }
}
