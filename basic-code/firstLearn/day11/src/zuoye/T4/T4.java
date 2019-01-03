package zuoye.T4;
/*
* 第四题：分析以下需求，并用代码实现

	要求:在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现

	public class Test {
		public static void main(String[] args) {
		}
	}
	//定义接口
	interface InterA {
		void showA();
	}
	class A {
		public void methodA(InterA a) {
			a.showA();
		}
	}

*/

class Test {
    public static void main(String[] args) {
        A a = new A ();
        a.methodA (new InterA () {
            @Override
            public void showA () {
                System.out.println ("匿名内部类，同时此没有对象名，也是匿名对象。");
            }
        });

        new A ().methodA (new InterA () {
            @Override
            public void showA () {
                System.out.println ("匿名内部类，同时此没有对象名，也是匿名对象。");
            }
        });


        a.methodA (new InterAImpl ());
    }
}
//定义接口
interface InterA {
    void showA();
}
class A {
    public void methodA(InterA a) {
        a.showA();
    }
}

class InterAImpl implements InterA{

    @Override
    public void showA () {
        System.out.println ("创建实现类对象");
    }
}