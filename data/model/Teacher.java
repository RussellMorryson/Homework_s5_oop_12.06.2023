package data.model;

public class Teacher extends User {   

    static int idTeachGen = 1;
    private int teacherId;

    public Teacher(String name, int bornDate) {
        super(name, bornDate);
        this.teacherId = idTeachGen++;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher ID: " + teacherId +
        " name: " + name + 
        " born date: " + bornDate;
    }
}
