package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y,int z) {
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
    public static void main(String args[]){
        Product p=new Product();
        int a= p.product(2,3);
        System.out.println(a);
        int b= p.product(2,3,4);
        System.out.println(b);
        double c= p.product(2.0,3.0);
        System.out.println(c);


    }
    //done is working



}
