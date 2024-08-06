package com.juaracoding;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        kotak(10);
        luatKotak(10);
        System.out.println(volumeKotak(6));
        System.out.println(setName("Indonesia","Jakarta"));
        System.out.println(login("aldo","pelanpelan"));
        detailProduk("Makanan","Chitato",50000);
        System.out.println("PPH per Bulan: "+salaryTax(14000));
        totalSalary(14000);
    }

    static void kotak(int sisi) {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void luatKotak(int sisi){
        System.out.println(sisi*sisi);
    }

    static int volumeKotak(int sisi){
        return sisi*sisi*sisi;
    }

    static String setName(String firstName, String lastName){
        return firstName+""+lastName;
    }

    static boolean login(String user, String pass){
        String usernameTrue = "aldo";
        String passwordTrue = "pelanpelan";
        if(user.equals(usernameTrue) && pass.equals(passwordTrue)){
            return true;
        }else {
            return false;
        }
    }

    static void detailProduk(String category, String productName, int harga){
        System.out.println("===============");
        System.out.println(category);
        System.out.println(productName);
        System.out.println(harga);
        System.out.println("===============");
    }

    //jika salary > 7000 (pajak 10%)
    //jika salary < 7000 (bukan wajib pajak)
    //totalsalaryperyear
    static double salaryTax (double salary){
        if (salary > 7000){
            return salary*0.1;
        }else {
            return salary;
        }
    }

    static void totalSalary (double salary){
        double total = (salary-salaryTax(salary))*12;
        System.out.println("Total Gaji per Tahun: "+total);

    }
 }
