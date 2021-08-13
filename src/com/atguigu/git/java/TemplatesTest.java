package com.atguigu.git.java;

import com.atguigu.git.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther zzk
 * @create 2021-08-09-17:01
 * sttings -Editor-lvie templates/postfix completion
 */
public class TemplatesTest {
    //prsf:常量定义
    private static final Customer cust=new Customer();

    //psf:常量定义
    public static final int NUM=1;


    //psfi:带类型常量定义
    public static final int NUM2=1;
    /**
     *年龄
     */
    private int age;
    /**
     *姓名
     */
    private String name;


    //psfs:String的常量定义
    public static final String NATION="china";
    public static final int NUM3 =10;
    //生成的测试模板
    public void testUpdate(){
        //.......
    }
    //生成的属性模板



    public static void main(String[] args) {
        System.out.println("sout,soutp,soutm,soutv,***.sout");
        //参数打印soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //方法打印soutm
        System.out.println("TemplatesTest.main");
        //就近变量选择打印soutv
        System.out.println("args = " + args);
        int num1=0;
        int num2=2;
        System.out.println("num2 = " + num2);
        //***.sout
        System.out.println(num1);
        String[] arr=new String[]{"1","2","3"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //iter
        for (String s : arr) {
            System.out.println(s);
        }

        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        List<String> list= new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        //list.for
        for (String s : list) {
            System.out.println("s = " + s);
        }

        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void  methodif(){
        System.out.println("TemplatesTest.methodif");
        //ifn
        ArrayList<String> li=new ArrayList<>();
        li.add("1");
        li.add("2");
        li.add("4");
        li.add("5");
        //ifn if none Livetemple里面的
        if (li == null) {

        }
        //inn if not none
        if (li != null) {

        }
        //xxx.null protfix里面的
        if (li == null) {

        }
        //xxxx.nn
        if (li != null) {

        }

    }

}
