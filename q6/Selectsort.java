package q6;

import java.util.Scanner;

//选择排序
public class Selectsort {
        public static void main(String[] args) {
            System.out.println("请输入要排序的数组，每个数据以“，”隔开");
            Scanner sc=new Scanner(System.in);
            String b=sc.nextLine();
            //将字符串以，分开
            String [] str1=b.split(",");
            int [] a=new int [str1.length];
            for (int i=0;i<str1.length;i++){
                a[i]=Integer.parseInt(str1[i]);
            }
            System.out.println("——————选择排序算法———————");
            selectSort(a);
            System.out.println("最终排序结果为：");
           print(a);
        }
    public  static void selectSort(int[] a) {
        int count=1;
        for (int i = 0; i < a.length; i++) {
            int k = i;
            // 找出最小值的下标
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            // 将最小值放到未排序记录的第一个位置
            if (k > i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
                System.out.println("第"+count+"次排序结果为：");
                print(a);
                count++;
            }
        }
    }
    public static void print(int a[]){

        for (int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
            System.out.println();
    }
}
