package juan.Java32jichu.T79Copy;

public class Plan {
    private String basicTeach;
    private String emplymentTeach;

    void printPlan () {
        System.out.println ("授课计划，基础班授课：" + getBasicTeach() + "，就业班授课：" + getEmplymentTeach());
    }

    public Plan () {
    }

    public Plan (String basicTeach, String emplymentTeach) {
        this.basicTeach = basicTeach;
        this.emplymentTeach = emplymentTeach;
    }

    public String getBasicTeach () {
        return basicTeach;
    }

    public void setBasicTeach (String basicTeach) {
        this.basicTeach = basicTeach;
    }

    public String getEmplymentTeach () {
        return emplymentTeach;
    }

    public void setEmplymentTeach (String emplymentTeach) {
        this.emplymentTeach = emplymentTeach;
    }
}
