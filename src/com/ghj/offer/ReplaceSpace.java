package com.ghj.offer;

/**
 * 将一个字符串中的空格替换成 "%20"。
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str){
        int p1 = str.length() - 1;
        for (int i = 0; i <= p1; i++){
            if (str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int p2 = str.length() - 1;
        //只有出现空字符串才会进入该循环
        while (p1 >= 0 && p2 > p1){
            char c = str.charAt(p1--);
            if (c == ' '){
                str.setCharAt(p2--, '0');
                str.setCharAt(p2--, '2');
                str.setCharAt(p2--, '%');
            }else {
                str.setCharAt(p2--, c);
            }
        }
        return str.toString();
    }
}
