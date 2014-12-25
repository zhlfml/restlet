package me.thomas.restlet.resources;

import me.thomas.restlet.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by thomas on 12/24/14.
 */
public class ResourceHelper {

    public static volatile int UUID = 1000;

    static Map<Integer, Student> map = new HashMap<Integer, Student>();
    static {
        Student student = new Student();
        student.setId(1);
        student.setName("Thomas");
        student.setGender("Man");
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

    static List<Student> findAll() {
        List<Student> students = new ArrayList<Student>();
        for (int id : map.keySet()) {
            students.add(map.get(id));
        }
        return students;
    }
}
