package test.inter;

public class test {
    public static void main (String[] args) {
        Hero hero = new Hero ();
        hero.setName ("艾希");

        //设置英雄技能
        hero.setSkill(new SkillImpl());

        //还可以改成使用匿名内部类
        Skill skill = new Skill(){
            @Override
            public void use () {
                System.out.println ("施展技能...Pia~pia~pia");
            }
        };

        hero.setSkill (skill);

        //进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill (new Skill () {
            @Override
            public void use () {
                System.out.println ("施展技能...Pia~pia~pia");
            }
        });

        hero.attack();
    }
}

class SkillImpl implements Skill {
    @Override
    public void use () {
        System.out.println ("施展技能...Pia~pia~pia");
    }
}


interface Skill {
    public abstract void use();  //施放技能
}

class Hero {
    private String name;
    private int age;
    private Skill skill;

    public void attack(){
        System.out.println ("英雄[" +name +"]开始施放技能：");
        skill.use ();
    }

    public Skill getSkill () {
        return skill;
    }

    public void setSkill (Skill skill) {
        this.skill = skill;
    }

    public Hero (String name, int age, Skill skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public Hero () {
    }

    public Hero (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
}