import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        int n=arr.length;
        String s1="";
        for(int i=n-1;i>=0;i--){
            s1 += arr[i];
            if (i != 0) {       
                s1 += " ";
            }
        } return s1;
    }
    }
}
