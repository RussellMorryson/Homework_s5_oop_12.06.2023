package data.model;

import java.util.List;

// — Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
public class StudyGroup {
    Teacher teacher;
    List<Student> studentList;

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Teacher getTeacher() {
        return teacher;
    }
}