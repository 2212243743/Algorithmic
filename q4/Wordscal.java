package q4;

import java.util.HashSet;


//字母算式解法
//问题：求使下面这个字母算式成立的解法有多少种？
//  READ ＋ WRITE ＋ TALK ＝ SKILL
//思路：穷举法。
public class Wordscal {
    public static void main(String[] args) {
        for (int R = 1; R < 10; R++) {
            for (int E = 0; E < 10; E++) {
                for (int A = 0; A < 10; A++) {
                    for (int D = 0; D < 10; D++) {
                        for (int W = 1; W < 10; W++) {
                            for (int I = 0; I < 10; I++) {
                                for (int T = 1; T < 10; T++) {
                                    for (int L = 0; L < 10; L++) {
                                        for (int K = 0; K < 10; K++) {
                                            for (int S = 1; S < 10; S++) {
                                                if (    ((W+1==S)||(W+2==S))&&
                                                        ((A+T==8)||(A+T==9)||(A+T==10))&&
                                                        ((E+A==8)||(E+A==9)||(E+A==10))){
                                                    HashSet s = new HashSet();
                                                    s.add(R);
                                                    s.add(E);
                                                    s.add(A);
                                                    s.add(D);
                                                    s.add(W);
                                                    s.add(I);
                                                    s.add(T);
                                                    s.add(L);
                                                    s.add(K);
                                                    s.add(S);
                                                    if (s.size() == 10) {
                                                        int read=R*1000+E*100+A*10+D;
                                                        int write=W*10000+R*1000+I*100+T*10+E;
                                                        int talk=T*1000+A*100+L*10+K;
                                                        int skill=S*10000+K*1000+I*100+L*10+L;
                                                        if(read+write+talk==skill){
                                                            System.out.println("read+write+talk=skill");
                                                            System.out.println(read + "+" + write + "+" + talk + "=" + skill);
                                                        }


                                                    }
                                                }

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}