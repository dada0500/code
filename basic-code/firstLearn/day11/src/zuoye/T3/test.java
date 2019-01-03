package zuoye.T3;
/*
* 第三题：分析以下需求，并用代码实现
	interface Inter {
		void show();
	}
	class Outer {
		//补齐代码
	}
	public class OuterDemo {
		public static void main(String[] args) {
			  Outer.method().show();
		  }
	}
	要求在控制台输出”HelloWorld”
*/
public class test {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

interface Inter {
    void show();
}
class Outer {
    //补齐代码
    //    // 1. Outer.method可以类名.去调用, 说明是静态的
    //    // 2. method方法调用完毕之后可以继续调用方法, 所以返回值类型必然是一个引用数据类型
    //    // 3. 该引用数据类型还能调用show方法, 而show方法只在Inter接口中存在, 所以返回值类型确定为Inter
    public static Inter method(){
        return new Inter (){
                @Override
                public void show () {
                    System.out.println ("HelloWorld");
                }
        };
    }
}