package com.sparta.springpractice.chapter01.lombok;

public class LombokPracticeMain {
    public static void main(String[] args) {

        User user = new User();

        user.setName("송콩떡");
        user.setAge(5);

        System.out.print(user);
    }
}
