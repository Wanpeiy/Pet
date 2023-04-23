package com.mashibing;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    //将string类型转换成日历类
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入日期（提示：请按照例如2019-5-23的格式输入）：");
        String next = sc.next();
        //将字符串转化成日期
        java.sql.Date date=Date.valueOf(next);
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);

        //将星期打印出来
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");

        //获取本月最大天数
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        //获取当前的日
        int day = cal.get(Calendar.DATE);
        //获取当前是周几(将其调成1号，查看1号是周几)
       cal.set(Calendar.DATE,1);
        int num = cal.get(Calendar.DAY_OF_WEEK);
        int day1=num-1;
        for(int i=1;i<=day1;i++){
            System.out.print("\t");
        }
        int count=day1;
        //遍历日期
        for(int i=1;i<=maxDay;i++){

            if(i==day){
                System.out.print(i+"*"+"\t");
            }else{
                System.out.print(i+"\t");
            }
            count++;
            if(count%7==0){
                System.out.println();
            }
        }
    }
}
