package Practice819;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * 面试题 01.04. 回文排列
     *
     * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
     *
     * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
     *
     * 回文串不一定是字典当中的单词。
     */


    public boolean canPermutePalindrome(String s) {
        Set<Character> set =new HashSet<>();
        for (int i = 0; i <s.length() ; i++) {
            if(!set.contains(s.charAt(i))){
               set.add(s.charAt(i));
            }else{
                set.remove(s.charAt(i));
            }
        }
        if(set.size()<=1){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        boolean flag = new Solution().canPermutePalindrome("tactcoa");
        System.out.println(flag);
    }



}
