package data.model;

public class Student extends User {
    
    static int idStudGen = 1;
    private int studentId;

    public Student (String name, int bornDate) {
        super(name, bornDate);
        this.studentId = idStudGen++;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {        
        return "Student ID: " + studentId +
        " name: " + name +
        " born date: " + bornDate;
    }
}
