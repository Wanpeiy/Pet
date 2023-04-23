package com.mashibing;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        //输入一个字符串，将其在日历类上标示出来
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个日期（例如：2019-5-23）:");
        String next = sc.next();


        //将字符串转化为日期
        java.sql.Date date= Date.valueOf(next);
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);

        //输出星期数
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");
        //获取本月的最大天数
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取日期是几号
        int day = cal.get(Calendar.DATE);
        //获取本月第一天是周几
        cal.set(Calendar.DATE,1);
        int num = cal.get(Calendar.DAY_OF_WEEK);
        //因为从0开始计算周期
        int count=num-1;
        //前几天输出空格
        for(int i=1;i<=count;i++){
            System.out.print("\t");
        }
        for(int i=1;i<=maxDay;i++){
            if(i==day){
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }count++;
            if(count%7==0){
                System.out.println();
            }
        }
    }
}
