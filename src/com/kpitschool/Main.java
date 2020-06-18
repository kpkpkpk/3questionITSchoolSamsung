package com.kpitschool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//3 задание
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(a>999||a<100){
            System.out.println("Введите трехзначное число");
            return;
        }
        System.out.println("Сумма ваших чисел равна:"+((a/100)+((a/10)%10)+(a%10)));






    }
}
