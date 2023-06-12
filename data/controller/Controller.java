package data.controller;

import java.util.List;

import data.model.Student;
import data.model.Teacher;
import data.service.StudyGroupService;

/* — Создать метод в Контроллере, в котором агрегируются функции получения 
списка студентов (их id) и преподавателя (его id) и формирования учебной 
группы, путём вызова метода из сервиса; */

public class Controller {   
    
    StudyGroupService sgs;

    public Controller() {
        this.sgs = new StudyGroupService();
    }

    public void create (List<Student> inputList, Teacher teacher) {
        if (inputList != null && teacher != null) {
            sgs.create(inputList, teacher);
        } else {
            System.out.println("Wrong data!");
        }
    }

    public void create (Student inputStudent) {
        sgs.create(inputStudent);
    }

    public void read() {
        sgs.read();
    }

}
