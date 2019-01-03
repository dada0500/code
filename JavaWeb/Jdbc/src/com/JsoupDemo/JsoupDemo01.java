package com.JsoupDemo;

/*import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import com.heima.demolist.tInterface;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;

public class JsoupDemo01 {
    public static void main (String[] args) throws Exception {
        String path = JsoupDemo01.class.getClassLoader ().getResource ("student0.xml").getPath ();
//        System.out.println (resource);
        Document doc = Jsoup.parse (new File (path), "utf-8");

        System.out.println ("--- 0 ---");
        Elements eles0 = doc.select ("#itcast");
        System.out.println (eles0 + "....");
        System.out.println ("--- 1 ---");
        Elements eles1 = doc.select ("student[number=\'heima_0234\']");
        System.out.println (eles1 + "....");
        System.out.println ("--- 2 ---");
        Elements eles2 = doc.select ("student[number='heima_0234']");
        System.out.println (eles2);
        System.out.println ("--- 3 ---");
        Elements eles3 = doc.select ("student[number=heima_0235]");
        System.out.println (eles3.text ());
/*
//        System.out.println (doc);
//  Element elementById = doc.getElementById ("1");
//        System.out.println (elementById);
        System.out.println ("----------");
        // 获取属性名为id的元素
        Elements elementById1 = doc.getElementsByAttribute ("id");
        System.out.println (elementById1);
        System.out.println ("-----person-----");
        // 获取标签为person的元素
        Elements person = doc.getElementsByTag ("Person");
        System.out.println (person);

        System.out.println ("-----select-----");

        // Jsoup中的select选择器
        Elements select = doc.select ("[sex]");
        System.out.println (select);


        System.out.println ("-----jxDocument-----");
        // JsoupXpath
        JXDocument jxDocument = new JXDocument (doc);
        System.out.println (jxDocument);

        System.out.println ("-----jxNodes-----");

        // 使用JsoupXpath,查询所有person下的firstname标签
        List<JXNode> jxNodes = jxDocument.selN ("//person/firstname");
        System.out.println (jxNodes);
        System.out.println ("-----//Person-----");
        // 查询 标签名为person的标签
        List<JXNode> jxNodes1 = jxDocument.selN ("//person");
        System.out.println (jxNodes1);
        System.out.println ("-----jxNodes.size ()-----");
        System.out.println (jxNodes.size ());
        System.out.println ("-----jxNode-----");
        jxNodes.forEach (System.out::println);
*/



    }
}