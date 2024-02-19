package com.ohgiraffers.section04.dto;

public class Application {

    public static void main(String[] args) {

        UserDTO user1 = new UserDTO ("ohgiraffers", "ohgiraffers", "ohgiraffers", new java.util.Date());
        System.out.println(user1.getInfo());

        UserDTO user2 = new UserDTO();
        user2.setId("ohgiraffers");
        user2.setPwd("ohgiraffers");
        user2.setName("ohgiraffers");
        user2.setEnrollDate(new java.util.Date());
        System.out.println(user2.getInfo());


    }

}
