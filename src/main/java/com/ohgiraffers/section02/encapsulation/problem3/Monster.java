package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {
//
//    String type;
//    int hp;

//    public void setName(String name) {
//
//        this.name = name;
//
//    }
//
//    public void setHp(int hp) {
//
//        if ( hp > 0 ) {
//            this.hp = hp;
//        } else {
//            this.hp = 0;
//        }

//
//    }

        String type;
        int hp;
        public void setName(String name) {

            this.type = name;

        }

    public void setHp(int hp) {

        this.hp = hp;

        if(hp > 0) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo() {

            return "몬스터의 종류는 " + this.type + "이고, 체력은 " + this.hp + "입니다";
    }
}
