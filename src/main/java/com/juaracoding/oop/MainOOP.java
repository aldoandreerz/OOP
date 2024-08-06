package com.juaracoding.oop;

import java.util.Date;

public class MainOOP {
    public static void main(String[] args) {

        Date date = new Date(1722860658);
        System.out.println(date);
        System.out.println(date.getDay());

        Fruit apple = new Fruit();
        apple.grams = 60;
        apple.calsPerGram = 15;
        System.out.println(apple.totalCalories());

        Fruit durian = new Fruit();
        durian.grams = 100;
        durian.calsPerGram = 63;
        System.out.println(durian.totalCalories());

        Kotak kotakSatu = new Kotak(5);
        kotakSatu.drawKotak();
        System.out.println(kotakSatu.luasKotak());

        Product sepatu = new Product(10000, "Sepatu", 150000, "sport shoes", "D:\\aldo\\1111.png");
        sepatu.detailProduct();
    }
}

