package ti0908;

import java.util.Scanner;

public class ti63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String account = sc.next();
        System.out.println("请输入密码：");       //输入字母会出错
        int password = sc.nextInt();

//        if("Itcast".equals(account) && "1010".equals(password)){  //出错
        if("Itcast".equals(account) && password == 1010){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
