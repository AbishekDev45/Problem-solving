import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int n = s1.length();
        String rev="";
        for(int i=n-1;i>=0;i--){
            rev += s1.charAt(i);
        }
        if(s1.equals(rev))System.out.println("YES");
        else System.out.println("NO");
    }
}
