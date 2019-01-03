package cn.itcast.day03.zuoye;
/*

第四题：分析以下需求并实现

	问题:
		1.想在控制台输出2次:"Java基础班"   括号()里面应该填写什么?
		2.想在控制台输出7次:"Java基础班"   括号()里面应该填写什么?
		3.想在控制台输出13次:"Java基础班"   括号()里面应该填写什么?

*/
public class t4 {
    public static void main(String[] args) {
        for(int x=1; x<=10; x++) {
            if(x%3==0) {
//               break; //  1.在控制台输出2次:"Java基础班"
//               continue; //  2.在控制台输出7次:"Java基础班"
                System.out.println("Java基础班"); //  3.在控制台输出7次:"Java基础班"
            }
            System.out.println("Java基础班");
        }
    }
}
