import data.controller.Controller;

import java.util.ArrayList;
import java.util.List;

import data.model.Student;
import data.model.Teacher;

public class Main {
    public static void main (String [] args) {
        // Создание 2 группы
        Controller controller1 = new Controller();

        Teacher t1 = new Teacher("Vladimir", 1956);        
        
        Student s1 = new Student("Valeria", 1999);
        Student s2 = new Student("Ludmila", 2002);
        Student s3 = new Student("Polina", 2004);

        List <Student> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
   
        controller1.create(list1, t1);
        controller1.read();

// Создание 2 группы
        Controller controller2 = new Controller();
        Teacher t2 = new Teacher("Oleg", 1960);        
        
        Student s4 = new Student("Valentin", 1999);
        Student s5 = new Student("Leonid", 2002);
        Student s6 = new Student("Sergey", 2004);

        List <Student> list2 = new ArrayList<>();
        list2.add(s4);
        list2.add(s5);
        list2.add(s6);
   
        controller2.create(list2, t2);
        controller2.read();
    }
}
