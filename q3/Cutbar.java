package q3;

import java.util.Scanner;
//假设要把长度为 n 厘米的木棒切分为 1 厘米长的小段，但是 1 根木棒只能由 1 人切分，当木棒被切分为 3 段后，可以同时由 3 个人分别切分木棒。
//求最多有 m 个人时，最少要切分几次。譬如 n ＝ 8，m ＝ 3，切分 4 次就可以了。
//求当 n ＝ 20，m ＝ 3 时的最少切分次数。
public class Cutbar {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("木棒长度：");
        int n = sc.nextInt();
        System.out.println("人数：");
        int m=sc.nextInt();
        int num=1;//num为当前木棒数
        int count=0;//切的次数
        cut(n,m,num,count);
    }
    public static void cut(int n,int m,int num,int count){
        if(num>=n){
            System.out.println("切的次数为："+count);
            return;
        }
        if(num>m){
            count++;
            cut(n,m,num+m,count);
        }
         if (num<=m){
             count++;
            cut(n,m,num*2,count);
         }

    }
}
