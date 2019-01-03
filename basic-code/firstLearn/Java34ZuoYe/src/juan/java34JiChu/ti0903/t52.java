package juan.java34JiChu.ti0903;

import java.util.ArrayList;

public class t52 {
    public static void main(String[] args) {
        User u1 = new User("张三",20);
        User u2 = new User("李四",30);
        User u3 = new User("王五",40);
        ArrayList<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() > 30){
                System.out.println("年龄大于30的有：");
                System.out.println("姓名：" + list.get(i).getName() + "    年龄：" + list.get(i).getAge());
            }
        }
    }
}

class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
