package com.zzc;

/**
 * 题目：判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int start=101;
        int end=200;
        int count=0;

        for (int i = start; i < end; i+=2) {
            if(isPrime(i)){
                count++;
                System.out.println("第"+count+"个素数："+i);
            }
        }

        System.out.println("素数一共有"+count+"个");
    }

    private static boolean isPrime(int i) {
        boolean flag = true;
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                flag=false;
                break;
            }
        }
        return flag;
    }


}
