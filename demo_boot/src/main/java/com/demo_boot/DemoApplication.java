package com.demo_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{
   //*求a后面第K个素数*//*
	public static void main(String[] args) {
//        int a=1; // 从这里开始找素数 31，37，41，43，47
//        int k=5;//后面第5个素数
//        List<Integer>list=new ArrayList<>();//定义一个数组来存找到的素数
//	    while(list.size()<k) {
//            boolean flags=true; //判断是否素数
//
//            for (int i = 2; i < a ; i++) {
//                if (a % i == 0) {
//                    flags=false;
//                    break;
//                }
//            }
//            if(flags){list.add(a);} //如果flages是true就是添加进素组
//            a++; //a往前加
//        }
//        System.out.println("a后面第k个素数是："+list.get(k-1)+"-----------------");


//	kkk    Integer a=-128;
//	    Integer b=-128;
//	    Integer c=new Integer(-128);
//        Integer d=Integer.valueOf(-128);
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(c==d);
//        System.out.println(a==d);*/
       SpringApplication.run(DemoApplication.class,args);
    }
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
