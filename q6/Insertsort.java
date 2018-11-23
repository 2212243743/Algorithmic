package q6;

import java.util.Scanner;

//  直接插入排序

public class Insertsort {
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
            insertSort(a);
        }
        public static void insertSort(int[] a) {
            System.out.println("——————直接插入排序算法———————");
            int i,j;
            for(i=1;i<a.length;i++){
                int temp = a[i];
                for(j=i-1;j>=0 && a[j]>temp;j--){
                    a[j+1] = a[j];
                }
                a[j+1] = temp;
                print(a,i);
            }
            printResult(a);
        }
        public static void printResult(int[] a){
            System.out.print("最终排序结果：");
            for(int j=0;j<a.length;j++){
                System.out.print(" "+a[j]);
            }
            System.out.println();
        }
        public static void print(int[] a, int i) {
            System.out.print("第"+i+"次：");
            for(int j=0;j<a.length;j++){
                System.out.print(" "+a[j]);
            }
            System.out.println();
        }
    }

