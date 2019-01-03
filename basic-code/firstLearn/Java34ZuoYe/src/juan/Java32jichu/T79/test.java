package juan.Java32jichu.T79;

public class test {
    public static void main (String[] args) {
        Teacher teacher = new Teacher ("张三",22);
        teacher.teaching (new Teach () {
            @Override
            public void teachPlan (Plan plan) {
                plan.printPlan ();
            }
        });
    }
}
