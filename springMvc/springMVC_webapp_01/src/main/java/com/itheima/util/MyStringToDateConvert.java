package com.itheima.util;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyStringToDateConvert implements Converter<String,Date>{
    @Override
    public Date convert (String s) {
        try {
            if(StringUtils.isEmpty (s)){
                throw new RuntimeException ("空值");
            }
            DateFormat df = new SimpleDateFormat ("yyyy-MM-dd");
            return df.parse (s);
        } catch (ParseException e) {
            throw new RuntimeException ("日期错误");
        }
    }
}
