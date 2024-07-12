package in.viru.beans;

public class Student
{
    private String name;
    private int roll_no;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(" This is setter name : ");
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        System.out.println("This is setter roll no : ");
        this.roll_no = roll_no;
    }
}
