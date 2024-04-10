package redandsilver.easy.java;

import java.util.Arrays;

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length-1];
        StringBuilder answer = new StringBuilder();
        int n = Math.min(f.length(),l.length());
        for(int i=0; i<n; i++){
            if(f.charAt(i) != l.charAt(i)){
                return answer.toString();
            }
            answer.append(f.charAt(i));
        }
        return answer.toString();
    }
}