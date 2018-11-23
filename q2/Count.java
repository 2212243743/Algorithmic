package q2;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
//问题：列的四则运算法则是，在各个数字之间插入四则运算的运算符组成算式（某些数位之间可以没有运算符，但最少要插入 1 个运算符）。
// 组合算式的计算结果为“将原数字各个数位上的数逆序排列得到的数”，并且算式的运算按照四则运算的顺序进行（先乘除，后加减） 。
//求位于 1000~9999，满足上述条件的数。

//思路：从1000开始遍历，将数值转为字符串后拆分开，在每位上插入“+”“-”“*”“/”“”中一个，
// 然后使用javax.script.ScriptEngine#eval(java.lang.String)，通过调用 JavaScript 来计算
public class Count {
    static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");
    public static void main(String[] args) {
        System.out.println("开始");
        String[] op = new String[]{"+", "-", "*", "/", ""};
        for (int i = 1000; i < 10000; i++) {
            String a = Integer.toString(i);
            for (int j = 0; j < op.length; j++) {
                for (int k = 0; k < op.length; k++) {
                    for (int l = 0; l < op.length; l++) {
                        String b = a.charAt(0) + op[j] + a.charAt(1) + op[k] + a.charAt(2) + op[l] + a.charAt(3);
                        //至少有一个运算符
                        if (b.length() > 4) {
                            try {
                                String result = String.valueOf(jse.eval(b));
                                StringBuffer resultreverse = new StringBuffer(result).reverse();
                                //加一层判断加快运行速度
                                if (result.length() == 4) {
                                    if (a.equals(resultreverse.toString())) {
                                        System.out.println(i + ": " + b + "=" + result);
                                    }
                                }
                            } catch (ScriptException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
            }

        }
    }
}
