package data.service;

import java.util.ArrayList;
import java.util.List;

import data.model.Student;
import data.model.Teacher;

/* — Создать класс УчебнаяГруппаСервис, в котором реализована функция 
(входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и 
Преподавателя УчебнойГруппы и возвращения его; */
public class StudyGroupService implements Service {
    static int idGroupGen = 1;
    private int GroupId;

    private List<Student> studentList;
    private Teacher teacher;

    public StudyGroupService () {
        this.studentList = new ArrayList<>();       
    }

    @Override
    public void create(List<Student> inputList, Teacher teacher) {
        this.GroupId = idGroupGen++;
        this.studentList.addAll(inputList);
        this.teacher = teacher;
    }

    @Override
    public void create(Student inputStudent) {
        this.studentList.add(inputStudent);        
    }

    @Override
    public void read() {
        System.out.println(teacher.toString());
        for(Student s : studentList) {
            System.out.println("\tGroup: " + GroupId + "-" + s.toString());
        }
        System.out.println("\n\n");
    }
}
