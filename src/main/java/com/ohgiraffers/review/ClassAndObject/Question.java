package com.ohgiraffers.review.ClassAndObject;

public class Question {

    /*

    -Q: 다음의속성(필드)를 가지는 VO클래스(Product)를작성해보자

    클래스명Product

    -제품명(productName) : String
    -제품번호(productNum) : int
    -가격(price) : int
    -사이즈(size) : char
*/
    public class Product {

        private String productName;
        private int productNum;
        private int price;
        private char size;

        public String getProductName() {
            return productName;
        }

        public void setProductName(String Name) {
            this.productName = productName;
        }

        public int getProductNum() {
            return productNum;
        }

        public void setProductNum(int productNum) {
            this.productNum = productNum;
        }


        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public char getSize() {
            return size;
        }

        public void setSize(char size){
            this.size = size;
        }




    }
}
