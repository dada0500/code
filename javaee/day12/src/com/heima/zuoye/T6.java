package com.heima.zuoye;
//练习六：this引用成员方法
//        按要求补全代码


public class T6 {
//3.	有测试类如下
    public static void main(String[] args) {
        Book book = new Book("新华字典","商务印书馆");
        book.sale();
    }
}


//1.	有字符串包装StringWrapper接口如下
interface StringWrapper {
    String wrap(String str);
}

//2.	有Book类如下
class Book {
    //书名
    private String name;
    //出版社
    private String publishingCompany;

    public Book(String name, String publishingCompany) {
        this.name = name;
        this.publishingCompany = publishingCompany;
    }

    //bookMsg()拼接带书名号的书名
    private String bookMsg(String bookname) {
        return "《" + bookname + "》";
    }

    //publishingMsg()拼接出版信息
    private String publishingMsg(String msg) {
        return "【专柜正品<" + msg + ">原装绝版】";
    }

    //packSaleMsg()使用StringWrapper为上架销售信息包装
    public String packSaleMsg(String msg, StringWrapper wrapper) {
        return wrapper.wrap(msg);
    }

    /*4.	填写Book类中空白横线处的代码，要求出现如下结果：
            《新华字典》【专柜正品<商务印书馆>原装绝版】
            2元一本，欲练此功，必先购买！*/

    //sale()上架销售
    public void sale() {
        //开始包装上架销售信息
//        String saleMsg = packSaleMsg(  name, this::bookMsg  ) + packSaleMsg(  publishingCompany, this::publishingMsg );
        String saleMsg = packSaleMsg(  this.name, (name) -> bookMsg (name) ) + packSaleMsg(  publishingCompany, publishingCompany -> publishingMsg (publishingCompany));
        System.out.println(saleMsg);
        //开始售卖
        System.out.println("2元一本，欲练此功，必先购买！");
    }
}