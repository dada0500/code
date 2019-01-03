package juan.A29.T22;

public class Dog extends Animal implements Sports{
    @Override
    void speak (String str) {
        System.out.println (getName () + "说：" + str);
    }

    public Dog () {
    }

    public Dog (String name) {
        super (name);
    }

    @Override
    public void swimming () {
        System.out.println (getName () + "狗刨中!");
    }

    public void goPlay(){
        speak ("快游");
        swimming ();
    }
}
