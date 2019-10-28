package com.Bach;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nhập số tháng để hiển thị số ngày trong tháng: ");
        int month = scan.nextInt();
        String DIM;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                DIM = "31";
                //System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 2:
                DIM = "28 hoặc 29";
                //System.out.println("Tháng " + month + " có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                DIM = "30";
                //System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                DIM = "";
                //System.out.println("Dữ liệu không hợp lệ, yêu cầu nhập lại");
        }
        if(DIM != ""){
            System.out.printf("Tháng '%d' có số ngày '%s' là", month, DIM);
        }else{
            System.out.println("dữ liệu không hợp lệ!");
        }
    }
}
