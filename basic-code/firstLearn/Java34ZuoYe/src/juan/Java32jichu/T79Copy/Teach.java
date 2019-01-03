package juan.Java32jichu.T79Copy;

public interface Teach {
    abstract void teachPlan (Plan plan);
    default void fun(){
        teach1();
        teach2();
    }

    private void teach1(){
        System.out.println ("为莘莘学子改变命运而讲课");
    }
    private void teach2(){
        System.out.println ("为千万学生少走弯路而著书");
    }
}
