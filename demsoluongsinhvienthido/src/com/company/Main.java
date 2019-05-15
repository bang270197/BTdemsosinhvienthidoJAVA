package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int size;
	int[] arr;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Nhap so luong sinh vien :");
            size=scanner.nextInt();
            if (size>30){
                System.out.println("sinh vien khong duoc vuot qua 30");
            }
        }while (size>30);
        arr =new int[size];
        int i=0;
        while (i<arr.length){
            System.out.println("Nhap diem cho hoc sinh "+(i+1));
            arr[i]=scanner.nextInt();
            i++;
        }
        int j=0;
        int count=0;
        System.out.println("Danh sach diem sinh vien");
        while (j<arr.length){
            System.out.print(arr[j]+"diem"+"\t");
            if (arr[j]>=5 && arr[j]<=10){
                count++;
            }
            j++;
        }
        System.out.println("\n"+"Co "+count+" sinh vien Thi do ");
    }
}
