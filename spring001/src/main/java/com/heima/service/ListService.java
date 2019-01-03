package com.heima.service;

import java.util.*;

public class ListService <T>{
    private String[] myArr;
    private List<T> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;

    public void setMyArr (String[] myArr) {
        this.myArr = myArr;
    }

    public void setMyList (List<T> myList) {
        this.myList = myList;
    }

    public void setMySet (Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap (Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps (Properties myProps) {
        this.myProps = myProps;
    }

    public void myPrint(){
        System.out.println (Arrays.toString (myArr));
        System.out.println (myList);
        System.out.println (mySet);
        System.out.println (myMap);
        System.out.println (myProps);
    }
}
