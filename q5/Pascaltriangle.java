package q5;
//帕斯卡三角形的特点
//第 n 行的数字个数为 n 个。
//第n行的第一个数字和最后一个数字为1；
//第i行j列数字为第i-1行j-1列数字异或第i-1行j列数字；
import java.util.Scanner;

public class Pascaltriangle {
    public static void main(String[] args) {
        System.out.println("请输入帕斯卡三角形层数");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        int count=0;
        for (int i = 0 ; i < n; i++) {
            a[i][0] = 1;
            a[i][i] = 1;
        }

        for (int i = 2 ; i < n ; i ++) {
            for (int j = 1; j < i ; j++) {
                a[i][j] = (a[i-1][j-1] )^ (a[i-1][j]);
                if (a[i][j]==0)count++;
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int k=0;k<n-i;k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i+1;j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("        第"+i+"行");
            System.out.println();
        }
        System.out.print(count);
    }
}
