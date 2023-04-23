package com.mashibing;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {


    public static void main(String[] args) {
        Calendar cal=new GregorianCalendar();
        System.out.println(cal.toString());
        //获取日期
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        //设置参数
        cal.set(Calendar.YEAR,1990);
        cal.set(Calendar.MONTH,3);
        System.out.println(cal);


    }
}
