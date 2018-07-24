package com.zzc;

import java.util.Scanner;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 *
 * 思路：递归
 */
public class RabbitNum {
    public static void main(String[] args) {
        int m;//月份
        System.out.println("输入月份：");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        System.out.println("这个月兔子的对数是："+fun(m));
    }
    private static int fun(int m){
        if (m == 1 || m == 2) {
            return 1;
        }else{
            return fun(m-2)+fun(m-1);
        }
    }
}
