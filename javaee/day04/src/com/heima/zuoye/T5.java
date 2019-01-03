package com.heima.zuoye;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class T5 {
    public static void main (String[] args) {
       /* 练习五：HashMap存储键是自定义对象值是String
        五、请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。
*/
        HashMap<Car,Integer> map = new HashMap<> ();
        map.put (new Car ("奔驰"),800);
        map.put (new Car ("宝马"),810);
        map.put (new Car ("红旗"),900);

        //keySet方式：
        System.out.println ("品牌\t价格");
        for(Car key : map.keySet ()){
            System.out.println (key.getBrand () + "\t" + map.get (key));
        }

        System.out.println ("-----------");

        //entrySet方式：
        System.out.println ("品牌\t价格");
        for(Map.Entry<Car,Integer> en : map.entrySet ()){
            System.out.println (en.getKey ().getBrand () + "\t" + en.getValue ());
        }
    }
}

class Car{
    private String brand;

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Car car = (Car) o;
        return Objects.equals (brand, car.brand);
    }

    @Override
    public int hashCode () {

        return Objects.hash (brand);
    }

    public Car (String brand) {
        this.brand = brand;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }
}
