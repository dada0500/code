package com.heima.zuoye;
//	练习九：Lambda（无参无返回）练习
/*
问题：
        给定一个导演 Director接口，内含唯一的抽象方法makeMovie，且无参数、无返回值，使用lambda表达式在Test中完成调用。
public interface Director {
    void makeMovie();
}

	在下面的代码中，请使用Lambda的省略格式调用 invokeDirect 方法，打印输出“导演拍电影啦！”字样：
public class Test09InvokeDirect {
    public static void main(String[] args) {
// TODO 请分别使用Lambda【省略格式】调用invokeDirect方法

        invokeDirect(()-> System.out.println(“php”));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}
*/

public class T9 {
    public static void main (String[] args) {
        Director d = () -> System.out.println ("调用Director接口");
        d.makeMovie ();

        new Director () {
            @Override
            public void makeMovie () {
                System.out.println ("new Director接口");
            }
        }.makeMovie ();

        ((Director) () -> {
            System.out.println ("Lambda");

        }).makeMovie ();

        ((Director) () -> System.out.println ("Lambda2")).makeMovie ();

        invokeDirect(()-> System.out.println("php"));
        invokeDirect(()-> System.out.println("导演拍电影啦！"));
    }
    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}

interface Director {
    void makeMovie();
}