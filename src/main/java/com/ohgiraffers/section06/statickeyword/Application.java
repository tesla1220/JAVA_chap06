package com.ohgiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /* 수업목표 : static 키워드에 대해 이해할 수 있다.
        *   필기
        *    static
        *     : 프로그램이 start 될 때 정적 메모리 영역에 할당을 하는 키워드
        *       인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정 가능
        *       여러 인스턴스가 공유해서 사용할 목적의 공간
        *       하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드가 되기 때문에 자제해야함
        *       명확한 목적이 있는 상황 제외, static 키워드는 사용 자제
        *       의도적으로 static 키워드를 사용하는 대표적인 예 -> singleton 객체를 생성할 때 */


        /* 목차 1. static 키워드를 필드에서 사용해보자! */
        StaticFieldTest sft1 = new StaticFieldTest();

        /* 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static field :" + sft1.getNonStaticCount());    // 0
        System.out.println("static field :" + sft1.getStaticCount());           // 0

        /* 두 필드의 값을 1씩 증가시킨 후 다시 값 확인 */
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("non-static field :" + sft1.getNonStaticCount());        // 1
        System.out.println("static field :" + sft1.getStaticCount());               // 1

        StaticFieldTest sft2 = new StaticFieldTest();
        System.out.println("non-static field : " + sft2.getNonStaticCount());       // 0
        System.out.println("static field:" +sft2.getStaticCount());                 // 1


        /* 필기
        *   인스턴스 변수(static이 안붙어 있음)의 경우, sft1과 sft2 두 개의 인스턴스가 서로 값을 공유하지 못하고
        *   인스턴스 변수를 생성할 때마다 기본값인 0으로 초기화가 되었다.
        *   하지만 static 필드의 경우 클래스 변수(static이 붙음)가 프로그램을 종료할 때까지 유지되고 있기 때문에 값을 유지하고 있다.
        *   따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다. */


        /* 목차 2. static 메소드 확인
        *   목차 2-1. non-static 메소드 호출 */

        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        /* 주의사항
        *   static 메소드도 이렇게 호출할 수 있다.
        *   하지만 static 메소드는 인스턴스를 생성하지 않고 호출하는 방식으로 사용해야 한다.
        *   static method는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 ㅁ나들기 때문에
        *   static 메소드를 호출하는 방식으로 호출해야한다. */

        smt.staticMethod();     // 권장하지 않음

        /* 목차 2-2. static 메소드 호출 */
        /* 필기
        *   클래스명.메소드명 */

        StaticMethodTest.staticMethod();        // 권장함


    }

}
