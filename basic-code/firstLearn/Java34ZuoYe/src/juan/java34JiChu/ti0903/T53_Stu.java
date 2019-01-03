package juan.java34JiChu.ti0903;

public class T53_Stu {
    private int snum;
    private double score;

    public T53_Stu(){}
    public T53_Stu(int snum, double score){
        this.snum = snum;
        this.score = score;
    }

    public void setSnum(int snum){
        this.snum = snum;
    }
    public int getSnum(){
        return snum;
    }
    public void setScore(double score){
        this.score  = score;
    }
    public double getScore(){
        return score;
    }
}
