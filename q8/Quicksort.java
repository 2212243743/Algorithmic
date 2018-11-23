package q8;

import java.util.Scanner;

public class Quicksort {
    static int i=0;
    public static int partition(int []array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){
                //从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){
                //从前半部分向后扫描
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        i++;
        System.out.print("第"+i+"此排序结果为：");
        print(array);
        return hi;
    }

    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }
    public static void print(int a[]){

        for (int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void main(String [] args){
        System.out.println("请输入要排序的数组，每个数据以“，”隔开");
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        //将字符串以，分开
        String [] str1=b.split(",");
        int [] a=new int [str1.length];
        for (int i=0;i<str1.length;i++){
            a[i]=Integer.parseInt(str1[i]);
        }
        System.out.println("——————快速排序算法———————");
        int hi=a.length-1;
        sort(a,0,hi);
        System.out.print("最终排序结果为：");
        print(a);
    }
}
