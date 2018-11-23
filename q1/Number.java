package q1;
//问题：求用十进制、 二进制、 八进制表示都是回文数的所有数字中，大于十进制数 10 的最小值。
//思路：因为十进制偶数的二进制尾数为0，所以这个数一定是奇数，从11开始测试，检测数字是否符合要求
//符合就输出，不符合就加2再判断，直至第一个符合条件的十进制数即是答案。
public class Number {
    public static void main(String[]args){
        int num=11;     //从11开始检测
         while(true){
            if(isPalindrome(num)){
                if(isPalindrome(Integer.parseInt(Integer.toBinaryString(num)))){
                    if(isPalindrome(Integer.parseInt(Integer.toOctalString(num)))) {
                        System.out.print(num);break;
                    }
                }

            }
            num+=2;
        }
       /* if(isPalindrome(num)){
            System.out.print(num);
        }*/
     }
    //判断数字数字是不是回文的方法
    public static boolean isPalindrome(int num){
        //StringBuffer s1=new StringBuffer("+num+");
        StringBuffer s1=new StringBuffer(Integer.toString(num));
        int num2=Integer.parseInt(s1.reverse().toString());
        if(num==num2)
            return true;
        else
            return false;
    }
}
