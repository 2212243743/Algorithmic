package q5;

import java.util.Scanner;

public class Line {
    public static void main(String [] args){
        System.out.println("请输入第几个0");
        Scanner sc=new Scanner(System.in);
        int aim=sc.nextInt();

        int count=0;//当前0的个数
        int line=2;//行数
        int cos=0;//当前列
        int []a=new int[line];//a为当前行
        a[0]=1;
        a[line-1]=1;
        while(count<aim){
            line++;
           int[]b=new int[line];//b为下一行
           b[0]=1;b[line-1]=1;
           for (int k=1;k<b.length-1;k++){

               b[k]=(a[k-1])^(a[k]);
               if (b[k]==0)count++;
           }
        a=b;

        }
        System.out.print("第"+aim+"个0在第"+line+"行出现");
    }
}
