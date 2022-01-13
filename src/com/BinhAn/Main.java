package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, number1;

        do {
            System.out.print("Nhập phần tử mảng 1: ");
            number = scanner.nextInt();

            if (number > 5) {
                System.out.println("số phần tử không quá 10");
            }
        }while (number > 5);
        int arr1[] = new int[number];
        for(int i =0; i< number;i++){
            System.out.println("nhập vị trí thứ " + i + "mảng 1: ");
            arr1[i]= scanner.nextInt();
        }
        do {
            System.out.print("nhập số phần tử mảng 2: ");
            number1 = scanner.nextInt();
            if (number1>5){
                System.out.println("số phần tử không vượt quá 10");
            }
        }while (number1>5);
        int arr2[] = new int[number1];
        for (int i =0; i<number1; i++){
            System.out.print("nhập phần tử thứ: "+ i + " mảng 2: ");
            arr2[i] = scanner.nextInt();
        }

        int[] newArr = gopMang(arr1, arr2);
        System.out.println("mảng sau khi gộp là: ");
        for (int i =0; i< newArr.length; i++){
            System.out.print(newArr[i]+"\t");
        }
    }
    public static int[] gopMang(int[] array1, int[] array2){
        int newArray[] = new int[array1.length + array2.length];
        for (int i = 0; i< array1.length; i++){
            newArray[i] = array1[i];
        }
        for (int j = array1.length; j< array1.length + array2.length; j++){
            newArray[j] = array2[j - array1.length];
        }
        return newArray;
    }
}