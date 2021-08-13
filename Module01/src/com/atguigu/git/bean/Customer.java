package com.atguigu.git.bean;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//单行注释
public class Customer {
    private String name;
    private int age;
    private String nickname;
//

    public Customer(String name, int age, String nickname) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    public Customer() {
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getNickname() {
//        return nickname;
//    }
//
//    public void setNickname(String nickname) {
//        this.nickname = nickname;
//    }

    public  static void main(String[] args){
        //region Description
        System.out.println("Hello module123!");
        ArrayList<String> a2=new ArrayList<>();
        a2.add(1, "2");

        a2.add("5");

        a2.add("3");a2.add("asd");
        //endregion
        checkA();
        Date aa = new Date();
        System.out.println(a2);
    }


    public static boolean checkA(){
        int num=9;
        try {
            FileInputStream fis =new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                throw new Exception("2");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("hotfix");
        System.out.println("master modify");
        return false;
    }

}
