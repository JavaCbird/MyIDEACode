package com.zzc;

/**
 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 * 程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
 */
public class LotusNumber {
    public static void main(String[] args) {
        int count=0;
        for (int i = 100; i < 999; i++) {
            if(isLotus(i)){
                count++;
                System.out.println("第"+count+"个水仙花数："+i);
            }
        }
        System.out.println("水仙花数一共有"+count+"个");

    }

    private static boolean isLotus(int i) {
        boolean flag=false;
        int one=i%10;
        int ten=i%100/10;
        int hundred=i/100;

        int sum=one*one*one+ten*ten*ten+hundred*hundred*hundred;
        if(i==sum){
            flag=true;
        }
        return flag;
    }

}
