package com01.itheima.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/**
 * 把字符串转换成日期的转换器
 * @author rt
 */
public class StringToDateConvertor implements Converter<String, Date>{
        /**
         * 进行类型转换的方法
         */
        @Override
        public Date convert(String source) {
            DateFormat format = null;
            try {
                if(StringUtils.isEmpty(source)) {
                    throw new NullPointerException("请输入要转换的日期");
                }
                format = new SimpleDateFormat("yyyy-MM-dd");
                Date date = format.parse(source);
                return date;
            } catch (Exception e) {
                throw new RuntimeException("输入日期有误");
            }
        }
}