package q3;
//思路二：逆向思考，本题可以等价为 m 个人黏合 1 厘米的木棒以组成 n 厘米的木
// 棒。也就是说，最终使黏合的木棒总长度为 n 厘米就可以了。

import java.util.Scanner;

public class Cutbar1 {
    public static void main(String[]args){
    int count=0;
    int current=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("木棒长度：");
        int n = sc.nextInt();
        System.out.println("人数：");
        int m=sc.nextInt();
    while (n>current){
        current += current<m?current:m;
        count++;
    }
        System.out.println("切的次数为："+count);
    }
}
