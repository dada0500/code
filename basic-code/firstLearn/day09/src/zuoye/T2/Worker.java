package zuoye.T2;

public class Worker extends Person {
    private String unit;
    private int workAge;

    @Override
    public void work(){
        System.out.println("Worker 盖房子");
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
}
