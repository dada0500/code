package com.JsoupDemo;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JsoupDemo02 {
    public static void main (String[] args) throws IOException, XpathSyntaxErrorException {
        // 1. 获取xml的路径
//        String path = JsoupDemo02.class.getClassLoader ().getResource ("com/JsoupDemo/xml/schema/student.xml").getPath ();
        String path = JsoupDemo02.class.getClassLoader ().getResource ("student0.xml").getPath ();
//        System.out.println ("----path----");
//        System.out.println (path);
        // 2. 通过Jsoup获取文档对象
//        Document doc = Jsoup.connect("http://ntlias-stu.boxuegu.com/#/index").get();
//        System.out.println (document);
        Document doc = Jsoup.parse (new File (path),"utf-8");
    /*    System.out.println ("----Document----");
        System.out.println (doc);
        System.out.println ("----Elements number----");
        Elements eles = doc.getElementsByAttributeStarting ("num");
        System.out.println (eles);
        System.out.println ("----Element----");
        Elements ele_name = eles.get (0).getElementsByTag ("name");
        System.out.println (ele_name);
        System.out.println ("----ele_name ---");
        String ele_0 = ele_name.val ();
        System.out.println (ele_0);
        System.out.println ("----ele_name text ---");
        String text = ele_name.text ();
        System.out.println (text);
*/
        // 3 .通过Jsoup获取值
        JXDocument jxDocument = new JXDocument (doc);
        List<JXNode> list = jxDocument.selN ("jxDocument");
        List<JXNode> list1 = jxDocument.selN ("//student//name");
        System.out.println ("----list ---");
        System.out.println (list);
        System.out.println ("----list1 ---");
        System.out.println (list1);

        System.out.println ("---- list1 for ----");
        for (JXNode jxNode : list1) {
            System.out.println (jxNode.getElement ().text ());
            System.out.println (jxNode.getTextVal ());
        }
        System.out.println ("---- list1 for 2----");
        for (JXNode jxNode : list1) {
            System.out.println (jxNode.getElement ().text ());
//            System.out.println (jxNode.getTextVal ());
            System.out.println (jxNode.sel ("text()"));
        }
        System.out.println ("----list3 ---");
        JXNode jxNode = jxDocument.selNOne ("//student/name");
        System.out.println (jxNode);
        String textVal = jxNode.toString ();
        System.out.println (textVal);
        System.out.println ("----list4 ---");
        JXNode jxNode1 = jxDocument.selNOne ("//student//name");
        System.out.println (jxNode1);
//        List<JXNode> sel = jxNode1.sel ("current-dateTime()");
//        System.out.println (sel);



    }
}
