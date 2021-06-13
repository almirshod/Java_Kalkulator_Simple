package com.kalkulatorIF;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner inputUser = new Scanner (System.in);
        float a,b,hasil;
        char operator;

        System.out.printf("Masukan Nilai: ");
        a = inputUser.nextFloat();
        System.out.printf("Operator: ");
        operator = inputUser.next().charAt(0);
        System.out.printf("Masukan Nilai: ");
        b = inputUser.nextFloat();

        System.out.println("Input User adalah: "+ a + " "+ operator + " " + b);
        
        if (operator == '+'){
            hasil = a + b;
            System.out.println("Hasilnya adalah: "+hasil);
        }else if (operator == '-'){
            hasil = a - b;
            System.out.println("Hasilnya adalah: "+hasil);
        }else if (operator == '/'){
                if (b == 0 ){
                System.out.println("Pembagi Nol Hasilnya Tak Hingga");
                }else {
                hasil = a / b;
                System.out.println("Hasilnya adalah: "+hasil); 
                }
        }else if (operator == '*'){
            hasil = a * b;
            System.out.println("Hasilnya adalah: "+ hasil); 
        }
    }   
}
