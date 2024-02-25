package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    /* 필기 - 클래스가 초기화 되는 시점에서는 정적*/
    private LazySingleton() {}

    public static LazySingleton getInstance() {

        /* 필기
        *   인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환하고
        *   생성한 인스턴스가 있는 경우 */
    }
}
