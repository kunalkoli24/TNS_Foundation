package P21Inheritance;

public class Student extends Citizen{

    public int rollNo;
    public String clgName;

    public Student(String name, long aadharName, String address,int rollNo, String clgName) {
        super(name,aadharName,address);
        this.rollNo = rollNo;
        this.clgName = clgName;
    }
}
