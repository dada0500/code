package juan.Java32jichu.T79Copy;

public class Test {
    public static void main (String[] args) {
        Teacher teacher = new Teacher ("张三",66);
        teacher.teaching (new Teach () {
            @Override
            public void teachPlan (Plan plan) {
                plan.printPlan ();
            }
        });
    }
}
