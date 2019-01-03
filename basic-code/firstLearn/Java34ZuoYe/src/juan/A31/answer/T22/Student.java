package juan.A31.answer.T22;

public class Student implements Study{
    private String name;
    private double score;
    private Line lin;

    public Student() {
    }

    public Student(String name, double score, Line lin) {
        this.name = name;
        this.score = score;
        this.lin = lin;
    }

    @Override
    public void studyLine() {
        System.out.println("您报名的就业班为："+lin.getEmplymentClass()+",应缴纳学费："+lin.getMoney()+"元。");
    }
    public void exam(){
        if (score>60){
            System.out.println("您的成绩为"+score+",考试通过");
        }else{
            System.out.println("您的成绩为"+score+",考试不通过");
        }
    }
}
