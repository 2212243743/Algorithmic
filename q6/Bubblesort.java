package q6;
//冒泡排序
import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void Bubblesort(int[] arr) {
        int temp;//定义一个临时变量
        int time=0;
        for(int i=0;i<arr.length-1;i++){//冒泡趟数
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            time++;
            System.out.print("第"+time+"此排序结果为：");
            print(arr);
        }
    }
    public static void print(int a[]){

        for (int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
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
        System.out.println("——————冒泡排序算法———————");
        Bubblesort.Bubblesort(a);
        System.out.print("最终排序结果为：");
        print(a);
    }
}
