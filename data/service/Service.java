package data.service;

import java.util.List;

import data.model.Student;
import data.model.Teacher;

public interface Service {
    public void create(List<Student> inputList, Teacher teacher);
    public void create(Student inputStudent);
    public void read();
}
