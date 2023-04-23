package com.mashibing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDemo {
    public static void main(String[] args) {
        //now()---获取当前的日期，时间，时间+日期
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);


        //of(),可以设置指定的日期，时间，日期+时间
    }
}
