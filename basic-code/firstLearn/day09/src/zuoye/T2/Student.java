package zuoye.T2;

public class Student extends Person {
    private String school;
    private String stuNumber;


    @Override
    public void work(){
        System.out.println("Student 的工作是学习");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }
}
